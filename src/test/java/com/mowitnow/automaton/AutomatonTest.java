package com.mowitnow.automaton;

import com.mowitnow.automaton.lawnmover.LawnMover;
import com.mowitnow.map.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class AutomatonTest {

    @Test
    public void givenlawnMover2x3EFormatWhenCreateThenGetLawnMover2x3E() throws AutomatonException {
        Automaton lawnMover2x3ECreated = AutomatonFactory.create("2 3 E");
        LawnMover lawnMover2x3E = new LawnMover(new Position(2, 3), Orientation.E);

        assertEquals(lawnMover2x3E, lawnMover2x3ECreated);
    }

    @Test
    public void givenlawnMover22x33EFormatWhenCreateThenGetLawnMover22x33E() throws AutomatonException {
        Automaton lawnMover22x33ECreated = AutomatonFactory.create("22 33 O");
        LawnMover lawnMover22x33E = new LawnMover(new Position(22, 33), Orientation.O);

        assertEquals(lawnMover22x33E, lawnMover22x33ECreated);
    }

    @Test(expected = AutomatonException.class)
    public void givenAnUnknowFormatWhencreateThenThrowAutomatonException() throws AutomatonException {
        AutomatonFactory.create("UNKNOW FORMAT");
    }
}
