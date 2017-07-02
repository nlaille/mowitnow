package com.mowitnow.map;

public class Orientation {
    private char orientation;

    public Orientation(char orientation) throws InvalidOrientationException {
        if (!"NESO".contains(Character.toString(orientation))) {
            throw new InvalidOrientationException(String.format("L'orientation %c n'existe pas", orientation));
        }
        this.orientation = orientation;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Orientation)) {
            return false;
        }
        Orientation otherOrientation = (Orientation)other;
        return this.orientation == otherOrientation.orientation;
    }
}
