package com.lab111.labwork4;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that allow us to use FlyWeight design pattern.
 *
 * @author Roma Bodarenko
 */
public class PointFactory {
    /**
     * Map that contains coordinates of the point as a key and the point as a value.
     */
    private static final Map<Coordinates, Point> POINTS = new HashMap<>();

    /**
     * Method that check the map and return a point with given coordinates
     * or create a new one if map does not contain such point.
     *
     * @param coordinates - coordinates of the point
     */
    public static Point getPointByCoordinates(Coordinates coordinates) {
        Point point = POINTS.get(coordinates);
        if (point == null) {
            point = new PointImpl(coordinates.getX(), coordinates.getY());
            POINTS.put(coordinates, point);
        }
        return point;
    }
}
