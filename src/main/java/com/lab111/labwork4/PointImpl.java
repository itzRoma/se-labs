package com.lab111.labwork4;

/**
 * Class which implements "Point" interface
 * and realizing "getX", "getY" and "draw" methods.
 *
 * @author Roma bondarenko
 */
public class PointImpl implements Point {
    /**
     * X coordinate of a point
     */
    private final double x;
    /**
     * Y coordinate of a point
     */
    private final double y;

    public PointImpl(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PointImpl(Coordinates coordinates) {
        x = coordinates.getX();
        y = coordinates.getY();
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    /**
     * Method that show the coordinates of a point
     */
    @Override
    public void draw() {
        System.out.printf("Point at the x=%.3f y=%.3f%n", x, y);
    }
}
