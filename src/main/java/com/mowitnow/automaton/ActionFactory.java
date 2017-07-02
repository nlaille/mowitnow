package com.mowitnow.automaton;

import com.mowitnow.automaton.lawnmover.LawnMover;
import com.mowitnow.map.InvalidOrientationException;
import com.mowitnow.map.Orientation;
import com.mowitnow.map.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActionFactory {
    public static List<Action> create(String format) throws AutomatonException {
        List<Action> actions = new ArrayList<>();

        for (char action : format.toCharArray()) {
            actions.add(new Action(action));
        }
        return actions;
    }
}
