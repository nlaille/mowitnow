package com.mowitnow.automaton;

import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;

public interface Automaton {
    OrientedPosition dryRun(Action action) throws ActionNotFoundException;
    void run(Action action) throws ActionNotFoundException;

    Position getPosition();
    Orientation getOrientation();
}
