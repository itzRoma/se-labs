package com.lab111.labwork3.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Parental class "ComplexExpression" implements interface "Composite"
 * and realizing the declared methods "addComponent", "removeComponent" and "show".
 *
 * This class can have more than one child.
 * It represents a complex expressions.
 *
 * @author Roma Bondarenko
 */
public class ComplexExpression implements Composite {
    /**
     * Child components.
     * They can be an implementations of a "Leaf" or "Composite" interfaces
     */
    private final List<Component> components = new ArrayList<>();

    public ComplexExpression() {
    }

    public ComplexExpression(Component component) {
        addComponent(component);
    }

    public ComplexExpression(Component...components) {
        if (components == null)
            throw new NullPointerException("child components cannot be null");

        this.components.addAll(List.of(components));
    }

    @Override
    public void addComponent(Component component) {
        if (component == null)
            throw new NullPointerException("child component cannot be null");

        components.add(component);
    }

    @Override
    public void removeComponent() {
        components.remove(components.size() - 1);
    }

    @Override
    public void show() {
        if (components.size() > 1) {
            for (Component component : components) {
                if (component instanceof ComplexExpression) {
                    System.out.print("(");
                    component.show();
                    System.out.print(")");
                } else {
                    component.show();
                }
            }
        } else {
            components.forEach(Component::show);
        }
    }
}
