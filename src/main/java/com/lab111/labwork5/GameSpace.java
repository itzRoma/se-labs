package com.lab111.labwork5;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implements "Mediator" interface and realize declared methods.
 *
 * @author Roma Bondarenko
 */
public class GameSpace implements Mediator {
    private final List<Component> components;

    public GameSpace() {
        components = new ArrayList<>();
    }

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        components.add(component);
    }

    @Override
    public double getArea() {
        double total = 0;
        for (Component component : components) {
            total += component.getArea();
        }
        return total;
    }

    @Override
    public void resize(double area) {
        double delta = area / getArea();
        components.forEach(component -> component.resize(component.getArea() * delta));
    }
}
