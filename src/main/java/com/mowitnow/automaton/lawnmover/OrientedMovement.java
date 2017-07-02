package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;

public abstract class OrientedMovement implements Movement {

    @Override
    public OrientedPosition executeFrom(OrientedPosition orientedPosition) {
        if (orientedPosition.getOrientation().equals(Orientation.N)) {
            return executeFromN(orientedPosition);
        }
        else if (orientedPosition.getOrientation().equals(Orientation.E)) {
            return executeFromE(orientedPosition);
        }
        else if (orientedPosition.getOrientation().equals(Orientation.S)) {
            return executeFromS(orientedPosition);
        }
        else if (orientedPosition.getOrientation().equals(Orientation.O)) {
            return executeFromO(orientedPosition);
        }
        else {
            return orientedPosition;
        }
    }

    abstract protected OrientedPosition executeFromN(OrientedPosition orientedPosition);
    abstract protected OrientedPosition executeFromE(OrientedPosition orientedPosition);
    abstract protected OrientedPosition executeFromS(OrientedPosition orientedPosition);
    abstract protected OrientedPosition executeFromO(OrientedPosition orientedPosition);
}
