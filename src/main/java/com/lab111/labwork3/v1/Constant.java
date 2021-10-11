package com.lab111.labwork3.v1;

/**
 * Child class "Constant" implements interface "Leaf"
 * and realizing the declared method "show".
 *
 * This class represents a constant.
 *
 * @author Roma Bondarenko
 */
public class Constant implements Leaf {
    private final int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public void show() {
        System.out.print(value);
    }
}
