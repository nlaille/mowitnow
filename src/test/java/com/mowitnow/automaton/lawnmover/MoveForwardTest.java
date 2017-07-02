package com.mowitnow.automaton.lawnmover;

import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MoveForwardTest {

    @Test
    public void givenOrientedPosition1x1NWhenMovingFowardThenGetOrientedPosition1x2N() {
        OrientedPosition orientedPosition1x1N = new OrientedPosition(new Position(1, 1), Orientation.N);
        OrientedPosition orientedPosition1x2N = new OrientedPosition(new Position(1, 2), Orientation.N);
        MoveForward moveForward = new MoveForward();

        assertEquals(orientedPosition1x2N, moveForward.executeFrom(orientedPosition1x1N));
    }

    @Test
    public void givenOrientedPosition1x1EWhenMovingFowardThenGetOrientedPosition2x1E() {
        OrientedPosition orientedPosition1x1E = new OrientedPosition(new Position(1, 1), Orientation.E);
        OrientedPosition orientedPosition2x1E = new OrientedPosition(new Position(2, 1), Orientation.E);
        MoveForward moveForward = new MoveForward();

        assertEquals(orientedPosition2x1E, moveForward.executeFrom(orientedPosition1x1E));
    }

    @Test
    public void givenOrientedPosition1x1SWhenMovingFowardThenGetOrientedPosition1x0S() {
        OrientedPosition orientedPosition1x1S = new OrientedPosition(new Position(1, 1), Orientation.S);
        OrientedPosition orientedPosition1x0S = new OrientedPosition(new Position(1, 0), Orientation.S);
        MoveForward moveForward = new MoveForward();

        assertEquals(orientedPosition1x0S, moveForward.executeFrom(orientedPosition1x1S));
    }

    @Test
    public void givenOrientedPosition1x1OWhenMovingFowardThenGetOrientedPosition0x1O() {
        OrientedPosition orientedPosition1x1O = new OrientedPosition(new Position(1, 1), Orientation.O);
        OrientedPosition orientedPosition0x1O = new OrientedPosition(new Position(0, 1), Orientation.O);
        MoveForward moveForward = new MoveForward();

        assertEquals(orientedPosition0x1O, moveForward.executeFrom(orientedPosition1x1O));
    }

}
