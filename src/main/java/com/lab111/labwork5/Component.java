package com.lab111.labwork5;

/**
 * Interface that represents a game cell and
 * declares "setMediator", "getArea" and "resize" methods;
 * it is "component" in mediator design pattern.
 *
 * @author Roma Bondarenko
 */
public interface Component {
    /**
     * Set mediator which can manipulate this component
     * @param mediator - mediator of this component
     */
    void setMediator(Mediator mediator);

    /**
     * @return area of a game cell
     */
    double getArea();

    /**
     * Set new area to a game cell.
     * @param area - new area of a game cell
     */
    void resize(double area);
}
