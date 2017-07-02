package com.mowitnow.automaton.lawnmover;

import com.mowitnow.automaton.Action;
import com.mowitnow.automaton.ActionNotFoundException;
import com.mowitnow.automaton.lawnmover.LawnMover;
import com.mowitnow.map.InvalidOrientationException;
import com.mowitnow.map.Orientation;
import com.mowitnow.map.OrientedPosition;
import com.mowitnow.map.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class LawnMoverTest {

    @Test
    public void givenALawnMoverAt2x2NWhenDryRunActionAThenReturnOrientedPosition2x3N() throws InvalidOrientationException {
        Position position2x2 = new Position(2, 2);
        Orientation orientationN = Orientation.N;
        LawnMover lawnMoverAt2x2N = new LawnMover(position2x2, orientationN);
        Action actionA = new Action('A');
        OrientedPosition orientedPosition2x3N = new OrientedPosition(new Position(2, 3), Orientation.N);

        assertEquals(orientedPosition2x3N, lawnMoverAt2x2N.dryRun(actionA));
    }

    @Test(expected = ActionNotFoundException.class)
    public void givenALawnMoverAt2x2NWhenDryRunActionUnknowThenThrowActionNotFound() throws InvalidOrientationException {
        Position position2x2 = new Position(2, 2);
        Orientation orientationN = Orientation.N;
        LawnMover lawnMoverAt2x2N = new LawnMover(position2x2, orientationN);
        Action actionUnknow = new Action('B');

        lawnMoverAt2x2N.dryRun(actionUnknow);
    }

    @Test
    public void givenALawnMoverAt2x2NWhenRunActionAThenLawnMoverAt2x3N() throws InvalidOrientationException {
        Position position2x2 = new Position(2, 2);
        Orientation orientationN = Orientation.N;
        LawnMover lawnMoverAt2x2N = new LawnMover(position2x2, orientationN);
        Action actionA = new Action('A');
        Position position2x3 = new Position(2, 3);

        lawnMoverAt2x2N.run(actionA);

        assertEquals(position2x3, lawnMoverAt2x2N.getPosition());
        assertEquals(Orientation.N, lawnMoverAt2x2N.getOrientation());
    }
}
