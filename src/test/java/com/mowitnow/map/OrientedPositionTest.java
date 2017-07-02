package com.mowitnow.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class OrientedPositionTest {

    @Test
    public void givenOrientedPosition2x2NWhenGettingPositionThenGetPosition2x2() throws InvalidOrientationException {
        Position position2x2 = new Position(2, 2);
        OrientedPosition orientedPosition2x2N = new OrientedPosition(new Position(2, 2), new Orientation('N'));

        assertEquals(position2x2, orientedPosition2x2N.getPosition());
    }

    @Test
    public void givenOrientedPosition2x2NWhenGettingOrientationThenGetOrientationN() throws InvalidOrientationException {
        Orientation orientationN = new Orientation('N');
        OrientedPosition orientedPosition2x2N = new OrientedPosition(new Position(2, 2), new Orientation('N'));

        assertEquals(orientationN, orientedPosition2x2N.getOrientation());
    }

    @Test
    public void givenOrientedPosition2x2NWhenCompareToAnotherOrientedPosition2x2NThenEquals() throws InvalidOrientationException {
        OrientedPosition orientedPosition2x2N = new OrientedPosition(new Position(2, 2), new Orientation('N'));
        OrientedPosition anotherOrientedPosition2x2N = new OrientedPosition(new Position(2, 2), new Orientation('N'));

        assertEquals(orientedPosition2x2N, anotherOrientedPosition2x2N);
    }
}
