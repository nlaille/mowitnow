package com.mowitnow.map;

public class OrientedPosition {
    private Orientation orientation;
    private Position position;

    public OrientedPosition(Position position, Orientation orientation) {
        this.orientation = orientation;
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof OrientedPosition)) {
            return false;
        }
        OrientedPosition otherOrientedPosition = (OrientedPosition)other;
        return this.position.equals(otherOrientedPosition.position)
                && this.orientation.equals(otherOrientedPosition.orientation);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.position, this.orientation);
    }
}
