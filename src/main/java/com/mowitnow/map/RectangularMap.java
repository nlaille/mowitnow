package com.mowitnow.map;

public class RectangularMap implements Map {
    private int maxX;
    private int maxY;


    public RectangularMap(int maxX, int maxY) throws MapException {
        if (maxX < 0 || maxY < 0) {
            throw new MapException("Impossible d'instancier une RectangularMap de taille negative.");
        }
        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    public boolean accept(Position position) {
        return position.getX() >= 0 && position.getX() <= this.maxX
                && position.getY() >= 0 && position.getY() <= this.maxY;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof RectangularMap)) {
            return false;
        }
        RectangularMap otherMap = (RectangularMap)other;
        return this.maxX == otherMap.maxX && this.maxY == otherMap.maxY;
    }

    @Override
    public String toString() {
        return String.format("RectangularMap [x:%d y:%d]", this.maxX, this.maxY);
    }

}
