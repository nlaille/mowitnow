package com.mowitnow.map;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Position)) {
            return false;
        }
        Position otherPosition = (Position)other;
        return this.getX() == otherPosition.getX() && this.getY() == otherPosition.getY();
    }
}
