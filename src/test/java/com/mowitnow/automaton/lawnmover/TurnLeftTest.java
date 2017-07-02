package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TurnLeftTest {

    @Test
    public void givenOrientedPosition1x1NWhenTurnLeftThenGetOrientedPosition1x1O() {
        OrientedPosition orientedPosition1x1N = new OrientedPosition(new Position(1, 1), Orientation.N);
        OrientedPosition orientedPosition1x1O = new OrientedPosition(new Position(1, 1), Orientation.O);
        TurnLeft turnLeft = new TurnLeft();

        assertEquals(orientedPosition1x1O, turnLeft.executeFrom(orientedPosition1x1N));
    }

    @Test
    public void givenOrientedPosition1x1OWhenTurnLeftThenGetOrientedPosition1x1S() {
        OrientedPosition orientedPosition1x1O = new OrientedPosition(new Position(1, 1), Orientation.O);
        OrientedPosition orientedPosition1x1S = new OrientedPosition(new Position(1, 1), Orientation.S);
        TurnLeft turnLeft = new TurnLeft();

        assertEquals(orientedPosition1x1S, turnLeft.executeFrom(orientedPosition1x1O));
    }

    @Test
    public void givenOrientedPosition1x1SWhenTurnLeftThenGetOrientedPosition1x1E() {
        OrientedPosition orientedPosition1x1S = new OrientedPosition(new Position(1, 1), Orientation.S);
        OrientedPosition orientedPosition1x1E = new OrientedPosition(new Position(1, 1), Orientation.E);
        TurnLeft turnLeft = new TurnLeft();

        assertEquals(orientedPosition1x1E, turnLeft.executeFrom(orientedPosition1x1S));
    }

    @Test
    public void givenOrientedPosition1x1EWhenTurnLeftThenGetOrientedPosition1x1N() {
        OrientedPosition orientedPosition1x1E = new OrientedPosition(new Position(1, 1), Orientation.E);
        OrientedPosition orientedPosition1x1N = new OrientedPosition(new Position(1, 1), Orientation.N);
        TurnLeft turnLeft = new TurnLeft();

        assertEquals(orientedPosition1x1N, turnLeft.executeFrom(orientedPosition1x1E));
    }

}
