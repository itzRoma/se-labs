package com.lab111.labwork3.v1;

/**
 * Parental class "SimpleExpression" implements interface "Composite"
 * and realizing the declared methods "addComponent", "removeComponent" and "show".
 *
 * This class can have only one child: variable or constant.
 * It represents a complex expressions.
 *
 * @author Roma Bondarenko
 */
public class SimpleExpression implements Composite {
    /**
     * Child component.
     * Can be ONLY a variable or a constant
     */
    private Component component;

    public SimpleExpression() {
    }

    public SimpleExpression(Component component) {
        add(component);
    }

    @Override
    public void addComponent(Component component) {
        add(component);
    }

    @Override
    public void removeComponent() {
        this.component = null;
    }

    @Override
    public void show() {
        component.show();
    }

    /**
     * Method to check if the provided component is a variable or constant
     *
     * @param component component to check
     * @return true if provided component is a variable or constant, false otherwise
     */
    private boolean check(Component component) {
        return component instanceof Variable || component instanceof Constant;
    }

    /**
     * Method to add a component.
     * In this case "SimpleExpression" can be a variable or a constant,
     * that means the component field is overrides everytime.
     *
     * @param component component to add
     */
    private void add(Component component) {
        if (component == null)
            throw new NullPointerException("child component cannot be null");

        if (check(component))
            this.component = component;
    }
}
