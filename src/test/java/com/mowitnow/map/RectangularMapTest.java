package com.mowitnow.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RectangularMapTest {

    @Test
    public void givenARectangularMapOf4x4WhenMovingTo1x1ThenReturningTrue() throws MapException {
        RectangularMap rectangularMapOf4x4 = new RectangularMap(4, 4);
        Position position1x1 = new Position(1, 1);

        assertTrue(rectangularMapOf4x4.accept(position1x1));
    }

    @Test
    public void givenARectangularMapOf4x4WhenMovingTo0x0ThenReturningTrue() throws MapException {
        RectangularMap rectangularMapOf4x4 = new RectangularMap(4, 4);
        Position position0x0 = new Position(0, 0);

        assertTrue(rectangularMapOf4x4.accept(position0x0));
    }

    @Test
    public void givenARectangularMapOf4x4WhenMovingTo4x4ThenReturningTrue() throws MapException {
        RectangularMap rectangularMapOf4x4 = new RectangularMap(4, 4);
        Position position4x4 = new Position(4, 4);

        assertTrue(rectangularMapOf4x4.accept(position4x4));
    }

    @Test
    public void givenARectangularMapOf4x4WhenMovingTo5x5ThenReturningFalse() throws MapException {
        RectangularMap rectangularMapOf4x4 = new RectangularMap(4, 4);
        Position position5x5 = new Position(5, 5);

        assertFalse(rectangularMapOf4x4.accept(position5x5));
    }

    @Test
    public void givenARectangularMapOf4x4WhenMovingToMinus1xMinus1ThenReturningTrue() throws MapException {
        RectangularMap rectangularMapOf4x4 = new RectangularMap(4, 4);
        Position positionMinus1xMinus1 = new Position(-1, -1);

        assertFalse(rectangularMapOf4x4.accept(positionMinus1xMinus1));
    }

    @Test(expected = MapException.class)
    public void givenARectangularMapOfMinus1xMinus1WhenInstantiatingThenThrowMapException() throws MapException {
        RectangularMap rectangularMapOfMinus1xMinus1 = new RectangularMap(-1, -1);
    }
}
