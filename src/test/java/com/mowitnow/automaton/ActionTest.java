package com.mowitnow.automaton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class ActionTest {

    @Test
    public void givenActionAWhenCompareToActionB2ThenNotEquals() {
        Action actionA = new Action('A');
        Action actionB = new Action('B');

        assertNotEquals(actionA, actionB);
    }

    @Test
    public void givenActionAWhenCompareToAnotherActionAThenEquals() {
        Action actionA = new Action('A');
        Action anotherActionA = new Action('A');

        assertEquals(actionA, anotherActionA);
    }
}
