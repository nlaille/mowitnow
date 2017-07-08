package com.mowitnow;

import com.mowitnow.automaton.*;
import com.mowitnow.central.CentralException;
import com.mowitnow.central.SequentialCentral;
import com.mowitnow.map.Map;
import com.mowitnow.map.MapException;
import com.mowitnow.map.MapFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SequentialFileLauncher {
    private static final Logger logger = LoggerFactory.getLogger(SequentialFileLauncher.class);

    private static final int BAD_USAGE = 1;
    private static final int FILE_NOT_FOUND = 2;
    private static final int FILE_BAD_FORMAT = 3;
    private static final int BAD_MAP_FORMAT = 4;
    private static final int BAD_AUTOMATON_FORMAT = 5;
    private static final int BAD_SEQUENTIAL_INITILAZE = 6;

    public static void main(String [] args) {
        if (args.length != 1) {
            exitWithMessage(BAD_USAGE, "Usage SequentialFileLauncher [file]");
        }
        String filePath = args[0];
        try {
            Path path = Paths.get(filePath);

            if (path == null) {
                exitWithMessage(FILE_NOT_FOUND, String.format("Le fichier %s n'existe pas.", filePath));
            }
            List<String> lines = Files.readAllLines(path, Charset.defaultCharset());

            if (lines.size() <= 1 || (lines.size() - 1) % 2 != 0) {
                exitWithMessage(FILE_BAD_FORMAT, "Le format du fichier n'est accepte");
            }
            try {
                Map map = MapFactory.create(lines.get(0));
                List<Automaton> automatons = new ArrayList<>();
                List<List<Action>> automatonsActions = new ArrayList<>();

                for(int i = 1; i < lines.size(); i += 2) {
                    automatons.add(AutomatonFactory.create(lines.get(i)));
                }
                for(int i = 2; i < lines.size(); i += 2) {
                    automatonsActions.add(ActionFactory.create(lines.get(i)));
                }
                SequentialCentral sequentialCentral = new SequentialCentral(automatons, map);

                sequentialCentral.run(automatonsActions);

                for (Automaton automaton : sequentialCentral.getAutomatons()) {
                    System.out.println(automaton.toString());
                }
            } catch (MapException e) {
                exitWithMessage(BAD_MAP_FORMAT, e.getMessage());
            } catch (AutomatonException e) {
                exitWithMessage(BAD_AUTOMATON_FORMAT, e.getMessage());
            } catch (CentralException e) {
                exitWithMessage(BAD_SEQUENTIAL_INITILAZE, e.getMessage());
            }
        } catch (IOException e) {
            exitWithMessage(FILE_NOT_FOUND, String.format("Le fichier %s n'existe pas.", filePath));
        }
    }

    private static void exitWithMessage(int exitCode, String message) {
        System.out.println(message);
        System.exit(exitCode);
    }
}
