package com.mowitnow.central;

import com.mowitnow.automaton.ActionFactory;
import com.mowitnow.automaton.Automaton;
import com.mowitnow.automaton.AutomatonException;
import com.mowitnow.automaton.AutomatonFactory;
import com.mowitnow.automaton.lawnmover.LawnMover;
import com.mowitnow.map.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SequentialCentralTest {

    Position position1x3 = new Position(1, 3);
    Position position5x1 = new Position(5, 1);

    @Test
    public void givenMap5x52AutomatonsWhenRunThen() throws AutomatonException, MapException, CentralException {
        Map rectangularMap5x5 = MapFactory.create("5 5");
        Automaton lawnMover1x2N = AutomatonFactory.create("1 2 N");
        Automaton lawnMover3x3E = AutomatonFactory.create("3 3 E");
        SequentialCentral sequentialCentral = new SequentialCentral(Arrays.asList(lawnMover1x2N, lawnMover3x3E), rectangularMap5x5);

        sequentialCentral.run(Arrays.asList(ActionFactory.create("GAGAGAGAA"), ActionFactory.create("AADAADADDA")));
        assertEquals(position1x3, lawnMover1x2N.getPosition());
        assertEquals(Orientation.N, lawnMover1x2N.getOrientation());

        assertEquals(position5x1, lawnMover3x3E.getPosition());
        assertEquals(Orientation.E, lawnMover3x3E.getOrientation());
    }
}
