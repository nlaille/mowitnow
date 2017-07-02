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
        return position.getX() >= 0 && position.getX() < this.maxX
                && position.getY() >= 0 && position.getY() < this.maxY;
    }
}
