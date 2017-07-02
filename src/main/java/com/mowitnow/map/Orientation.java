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


    @Override
    public String toString() {
        return String.format("Orientation [%c]", this.orientation);
    }

    public static final Orientation N = instantiate('N');
    public static final Orientation E = instantiate('E');
    public static final Orientation S = instantiate('S');
    public static final Orientation O = instantiate('O');

    private static Orientation instantiate(char orientation) {
        try {
            return new Orientation(orientation);
        } catch (InvalidOrientationException e) {
            throw new RuntimeException("Orientation invalide lors de la construction");
        }
    }
}
