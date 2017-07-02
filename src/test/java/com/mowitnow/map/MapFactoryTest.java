package com.mowitnow.map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class MapFactoryTest {

    @Test
    public void givenRectangularMap4x4FormatWhenCreateThenGetRectangularMap4x4() throws MapException {
        Map rectangularMapOf4x4Created = MapFactory.create("4 4");
        RectangularMap rectangularMapOf4x4 = new RectangularMap(4, 4);

        assertEquals(rectangularMapOf4x4, rectangularMapOf4x4Created);
    }

    @Test
    public void givenRectangularMap4x6FormatWhenCreateThenGetRectangularMap4x6() throws MapException {
        Map rectangularMapOf4x6Created = MapFactory.create("4 6");
        RectangularMap rectangularMapOf4x6 = new RectangularMap(4, 6);

        assertEquals(rectangularMapOf4x6, rectangularMapOf4x6Created);
    }

    @Test
    public void givenRectangularMap44x66FormatWhenCreateThenGetRectangularMap44x66() throws MapException {
        Map rectangularMapOf44x66Created = MapFactory.create("44 66");
        RectangularMap rectangularMapOf44x66 = new RectangularMap(44, 66);

        assertEquals(rectangularMapOf44x66, rectangularMapOf44x66Created);
    }

    @Test(expected = MapException.class)
    public void givenAnUnknowFormatWhencreateThenThrowMapException() throws MapException {
        MapFactory.create("UNKNOW FORMAT");
    }
}
