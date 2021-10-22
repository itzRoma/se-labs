package com.lab111.labwork4;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements "Circle" interface
 * and realizing "getPhi", "getRho" and "draw" methods.
 *
 * @author Roma Bondarenko
 */
public class CircleImpl implements Circle {
    /**
     * Phi in polar coordinates.
     * Phi is an angle between x-axis and a line that connect the center and a random point.
     */
    private double phi;
    /**
     * Rho in polar coordinates.
     * Rho is a distance between the center and a random point.
     */
    private final double rho;

    /**
     * List that contains points of the circle
     */
    private final List<Point> points = new ArrayList<>();

    public CircleImpl(double phi, double rho) {
        this.phi = phi;
        this.rho = rho;
    }

    public CircleImpl(Point point) {
        rho = Math.sqrt((Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2)));
        phi = Double.parseDouble(String.format("%.2f", Math.asin((point.getY() / rho))));
    }

    @Override
    public double getPhi() {
        return phi;
    }

    @Override
    public double getRho() {
        return rho;
    }

    /**
     * Method that draw a circle by points
     */
    @Override
    public void draw() {
        final double oldPhi = phi;

        while (phi < (oldPhi + 2 * Math.PI)) {
            double newX = rho * Math.cos(phi);
            double newY = rho * Math.sin(phi);
            Coordinates newCoordinates = new Coordinates(newX, newY);

            points.add(PointFactory.getPointByCoordinates(newCoordinates));

            phi += 0.1;
        }

        System.out.printf("Circle with radius=%.2f%n", rho);
        System.out.printf("There are %d points in this circle%n", points.size());
    }
}
