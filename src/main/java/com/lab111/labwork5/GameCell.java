package com.lab111.labwork5;

/**
 * Class implements "Component" interface and realize declared methods.
 *
 * @author Roma Bondarenko
 */
public class GameCell implements Component {
    private double area;

    private Mediator mediator;

    public GameCell(double area) {
        this.area = area;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void resize(double area) {
        this.area = area;
    }
}
