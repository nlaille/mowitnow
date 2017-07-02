package com.mowitnow.map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapFactory {
    private static final Pattern rectangularMapPattern = Pattern.compile("(\\d+) (\\d+)");
    public static Map create(String format) throws MapException {
        Matcher rectangularMatcher = rectangularMapPattern.matcher(format);
        if (rectangularMatcher.matches()) {
            int x = Integer.valueOf(rectangularMatcher.group(1));
            int y = Integer.valueOf(rectangularMatcher.group(2));
            return new RectangularMap(x, y);
        }
        else {
            throw new MapException("Le format de la map n'est pas connu.");
        }
    }
}
