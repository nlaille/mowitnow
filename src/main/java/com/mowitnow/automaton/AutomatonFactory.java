package com.mowitnow.automaton;

import com.mowitnow.automaton.lawnmover.LawnMover;
import com.mowitnow.map.InvalidOrientationException;
import com.mowitnow.map.Orientation;
import com.mowitnow.map.Position;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutomatonFactory {
    private static final Pattern lawnMoverPattern = Pattern.compile("(\\d+) (\\d+) ([NESO])");

    public static Automaton create(String format) throws AutomatonException {
        Matcher lawnMoverMatcher = lawnMoverPattern.matcher(format);
        if (lawnMoverMatcher.matches()) {
            int x = Integer.valueOf(lawnMoverMatcher.group(1));
            int y = Integer.valueOf(lawnMoverMatcher.group(2));
            char orientation = lawnMoverMatcher.group(3).charAt(0);
            try {
                return new LawnMover(new Position(x, y), new Orientation(orientation));
            } catch (InvalidOrientationException e) {
                throw new AutomatonException("Orientation invalide lors de la creation d'un lawnmover");
            }
        }
        else {
            throw new AutomatonException("Le format de l'automate n'est pas connu.");
        }
    }
}
