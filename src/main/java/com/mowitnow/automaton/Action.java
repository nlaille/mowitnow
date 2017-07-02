package com.mowitnow.automaton;

public class Action {
    private char action;

    public Action(char action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Action)) {
            return false;
        }
        Action otherAction = (Action)other;
        return this.action == otherAction.action;
    }
}
