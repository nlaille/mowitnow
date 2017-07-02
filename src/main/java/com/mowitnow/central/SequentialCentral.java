package com.mowitnow.central;

import com.mowitnow.automaton.Action;
import com.mowitnow.automaton.Automaton;
import com.mowitnow.map.Map;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class SequentialCentral {
    private static final Logger logger = LoggerFactory.getLogger(SequentialCentral.class);

    private List<Automaton> automatons;
    private Map map;

    public SequentialCentral(List<Automaton> automatons, Map map) throws CentralException {
        for (Automaton automaton : automatons) {
            if (!map.accept(automaton.getPosition())) {
                throw new CentralException(String.format("%s ne peut se trouver dans %s", automaton, map));
            }
        }
        this.automatons = automatons;
        this.map = map;
    }

    public void run(List<List<Action>> actions) throws CentralException {
        if (this.automatons.size() < actions.size()) {
            throw new CentralException("Il y a plus d'actions que d'automate.");
        }
        int i = 0;

        while (i < actions.size()) {
            Automaton automaton = automatons.get(i);
            List<Action> automatonActions = actions.get(i);
            logger.info("Debut {}: {}", automaton, automatonActions);
            runAutomatonSequence(automaton, automatonActions);
            logger.info("Fin {}", automaton);
            i++;
        }
    }

    private void runAutomatonSequence(Automaton automaton, List<Action> actions) {
        for (Action action : actions) {
            OrientedPosition nextOrientedPosition = automaton.dryRun(action);
            if (map.accept(nextOrientedPosition.getPosition())) {
                if (automaton.getPosition().equals(nextOrientedPosition.getPosition())) {
                    automaton.run(action);
                }
                else if (!isThereAutomatonHere(nextOrientedPosition.getPosition())) {
                    automaton.run(action);
                }
                else {
                    logger.info("Il y a deja un automate a cette place.");
                }
            }
            else {
                logger.info("La carte n'accete pas cette action.");
            }
        }
    }

    private boolean isThereAutomatonHere(Position position) {
        for (Automaton automaton : automatons) {
            if (automaton.getPosition().equals(position))
                return true;
        }
        return false;
    }


}
