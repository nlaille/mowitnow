package com.mowitnow.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(JUnit4.class)
public class OrientationTest {

    @Test
    public void givenOrientationNWhenCompareToOrientationSThenNotEquals() throws InvalidOrientationException {
        Orientation orientationN = new Orientation('N');
        Orientation orientationS = new Orientation('S');

        assertNotEquals(orientationN, orientationS);
    }

    @Test
    public void givenOrientationNWhenCompareToAnotherOrientationNThenEquals() throws InvalidOrientationException {
        Orientation orientationN = new Orientation('N');
        Orientation anotherOrientationN = new Orientation('N');

        assertEquals(orientationN, anotherOrientationN);
    }

    @Test(expected = InvalidOrientationException.class)
    public void givenOrientationUnknowWhenInstantiatingThenThrowInvalidOrientationExcetpion() throws InvalidOrientationException {
        Orientation orientationUnknow = new Orientation('K');
    }
}
