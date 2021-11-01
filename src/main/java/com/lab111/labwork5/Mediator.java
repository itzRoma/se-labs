package com.lab111.labwork5;

/**
 * Interface that represents a game space and
 * declares "registerComponent", "getArea" and centralized "resize" methods;
 * it is "mediator" in mediator design pattern.
 *
 * @author Roma Bondarenko
 */
public interface Mediator {
    /**
     * Register component to this mediator.
     * @param component - component to register
     */
    void registerComponent(Component component);

    /**
     * Calculate total area of game space by getting area of each cell.
     * @return area of whole game space
     */
    double getArea();

    /**
     * Set new area of game space by resizing cells in it.
     * @param area - new area of a game space
     */
    void resize(double area);
}
