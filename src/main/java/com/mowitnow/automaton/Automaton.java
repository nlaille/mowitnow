package com.mowitnow.automaton;

import com.mowitnow.map.OrientedPosition;

public interface Automaton {
    OrientedPosition dryRun(Action action) throws ActionNotFoundException;
    void run(Action action) throws ActionNotFoundException;
}
