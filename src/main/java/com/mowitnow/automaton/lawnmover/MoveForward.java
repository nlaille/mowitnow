package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.OrientedPosition;

public class MoveForward extends OrientedMovement {

    @Override
    protected OrientedPosition executeFromN(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition().add(0 ,1), orientedPosition.getOrientation());
    }

    @Override
    protected OrientedPosition executeFromE(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition().add(1 ,0), orientedPosition.getOrientation());
    }

    @Override
    protected OrientedPosition executeFromS(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition().add(0 ,-1), orientedPosition.getOrientation());
    }

    @Override
    protected OrientedPosition executeFromO(OrientedPosition orientedPosition) {
        return new OrientedPosition(orientedPosition.getPosition().add(-1 ,0), orientedPosition.getOrientation());
    }
}
