package com.lab111.labwork4;

/**
 * Class for testing labwork4.
 *
 * @author Roma Bomdarenko
 */
public class Test400 {
    public static void main(String[] args) {
        Point point = new PointImpl(2, 3);
        point.draw();

        Circle circle = new CircleImpl(point);
        circle.draw();
    }
}
