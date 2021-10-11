package com.lab111.labwork3.v1;

/**
 * Child class "Variable" implements interface "Leaf"
 * and realizing the declared method "show".
 *
 * This class represents a variable.
 *
 * @author Roma Bondarenko
 */
public class Variable implements Leaf {
    private final String value;

    public Variable(String value) {
        this.value = value;
    }

    @Override
    public void show() {
        System.out.print(value);
    }
}
