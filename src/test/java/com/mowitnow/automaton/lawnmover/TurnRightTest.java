package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TurnRightTest {

    @Test
    public void givenOrientedPosition1x1NWhenTurnRightThenGetOrientedPosition1x1E() {
        OrientedPosition orientedPosition1x1N = new OrientedPosition(new Position(1, 1), Orientation.N);
        OrientedPosition orientedPosition1x1E = new OrientedPosition(new Position(1, 1), Orientation.E);
        TurnRight turnRight = new TurnRight();

        assertEquals(orientedPosition1x1E, turnRight.executeFrom(orientedPosition1x1N));
    }

    @Test
    public void givenOrientedPosition1x1EWhenTurnRightThenGetOrientedPosition1x1S() {
        OrientedPosition orientedPosition1x1E = new OrientedPosition(new Position(1, 1), Orientation.E);
        OrientedPosition orientedPosition1x1S = new OrientedPosition(new Position(1, 1), Orientation.S);
        TurnRight turnRight = new TurnRight();

        assertEquals(orientedPosition1x1S, turnRight.executeFrom(orientedPosition1x1E));
    }

    @Test
    public void givenOrientedPosition1x1SWhenTurnRightThenGetOrientedPosition1x1O() {
        OrientedPosition orientedPosition1x1S = new OrientedPosition(new Position(1, 1), Orientation.S);
        OrientedPosition orientedPosition1x1O = new OrientedPosition(new Position(1, 1), Orientation.O);
        TurnRight turnRight = new TurnRight();

        assertEquals(orientedPosition1x1O, turnRight.executeFrom(orientedPosition1x1S));
    }

    @Test
    public void givenOrientedPosition1x1OWhenTurnRightThenGetOrientedPosition1x1N() {
        OrientedPosition orientedPosition1x1O = new OrientedPosition(new Position(1, 1), Orientation.O);
        OrientedPosition orientedPosition1x1N = new OrientedPosition(new Position(1, 1), Orientation.N);
        TurnRight turnRight = new TurnRight();

        assertEquals(orientedPosition1x1N, turnRight.executeFrom(orientedPosition1x1O));
    }

}
