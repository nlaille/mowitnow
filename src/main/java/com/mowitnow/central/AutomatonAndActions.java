package com.mowitnow.central;

import com.mowitnow.automaton.Automaton;

public class AutomatonAndActions {
    private Automaton automaton;
    private String actions;

    public AutomatonAndActions(Automaton automaton, String actions) {
        this.automaton = automaton;
        this.actions = actions;
    }
}
