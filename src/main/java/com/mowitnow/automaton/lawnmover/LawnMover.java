package com.mowitnow.automaton.lawnmover;

import com.mowitnow.automaton.Action;
import com.mowitnow.automaton.ActionNotFoundException;
import com.mowitnow.automaton.Automaton;
import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;

import java.util.HashMap;
import java.util.Map;

public class LawnMover implements Automaton {
    private Position position;
    private Orientation orientation;

    private Map<Action, Movement> movements;



    public LawnMover(Position position, Orientation orientation) {
        this.position = position;
        this.orientation = orientation;

        this.movements = new HashMap<>();
        this.movements.put(new Action('A'), new MoveForward());
        this.movements.put(new Action('D'), new TurnRight());
        this.movements.put(new Action('G'), new TurnLeft());
    }

    @Override
    public Orientation getOrientation() {
        return orientation;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public OrientedPosition dryRun(Action action) throws ActionNotFoundException {
        OrientedPosition actualOrientedPosition = new OrientedPosition(this.position, this.getOrientation());
        return getMovement(action).executeFrom(actualOrientedPosition);
    }

    @Override
    public void run(Action action) throws ActionNotFoundException {
        OrientedPosition actualOrientedPosition = new OrientedPosition(this.position, this.getOrientation());
        OrientedPosition newOrientedPosition = getMovement(action).executeFrom(actualOrientedPosition);
        this.position = newOrientedPosition.getPosition();
        this.orientation = newOrientedPosition.getOrientation();
    }

    private Movement getMovement(Action action) throws ActionNotFoundException {
        for (Map.Entry<Action, Movement> keyValue : this.movements.entrySet()) {
            if (keyValue.getKey().equals(action)) {
                return keyValue.getValue();
            }
        }
        throw new ActionNotFoundException(String.format("L'action %s n'existe pas.", action));
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof LawnMover)) {
            return false;
        }
        LawnMover otherLawnMover = (LawnMover)other;
        return this.position.equals(otherLawnMover.position) && this.orientation.equals(otherLawnMover.orientation);
    }

    @Override
    public String toString() {
        return String.format("LawnMover %s - %s", this.position, this.orientation);
    }

}
