package com.mowitnow.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class PositionTest {

    @Test
    public void givenPosition1x1WhenCompareToPosition2x2ThenNotEquals() {
        Position position1x1 = new Position(1, 1);
        Position position2x2 = new Position(2, 2);

        assertNotEquals(position1x1, position2x2);
    }

    @Test
    public void givenPosition1x1WhenCompareToPosition2x3ThenNotEquals() {
        Position position1x1 = new Position(1, 1);
        Position position2x3 = new Position(2, 3);

        assertNotEquals(position1x1, position2x3);
    }

    @Test
    public void givenPosition1x1WhenCompareToPosition1x3ThenNotEquals() {
        Position position1x1 = new Position(1, 1);
        Position position1x3 = new Position(1, 3);

        assertNotEquals(position1x1, position1x3);
    }

    @Test
    public void givenPosition1x1WhenCompareToAnotherPosition1x1ThenEquals() {
        Position position1x1 = new Position(1, 1);
        Position anoterPosition1x1 = new Position(1, 1);

        assertEquals(position1x1, anoterPosition1x1);
    }

    @Test
    public void givenPosition1x1WhenAdding2x2ThenReturingPosition3x3() {
        Position position1x1 = new Position(1, 1);
        Position position3x3 = new Position(3, 3);

        assertEquals(position3x3, position1x1.add(2, 2));
    }

    @Test
    public void givenPosition2x1WhenCompareToAnotherPosition2x1ThenEquals() {
        Position position2x1 = new Position(2, 1);
        Position anoterPosition2x1 = new Position(2, 1);

        assertEquals(position2x1, anoterPosition2x1);
    }
}
