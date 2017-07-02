package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;

public class TurnLeft extends OrientedMovement {

    @Override
    protected OrientedPosition executeFromN(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition(), Orientation.O);
    }

    @Override
    protected OrientedPosition executeFromE(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition(), Orientation.N);
    }

    @Override
    protected OrientedPosition executeFromS(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition(), Orientation.E);
    }

    @Override
    protected OrientedPosition executeFromO(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition(), Orientation.S);
    }
}
