package com.lab111.labwork4;

/**
 * Simple class that represents point's coordinates.
 *
 * @author Roma Bomdarenko
 */
public class Coordinates {
    /**
     * X coordinate of a point
     */
    private final double x;
    /**
     * Y coordinate of a point
     */
    private final double y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
