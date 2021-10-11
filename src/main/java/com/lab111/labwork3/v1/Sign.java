package com.lab111.labwork3.v1;

/**
 * Child class "Sign" implements interface "Leaf"
 * and realizing the declared method "show".
 *
 * This class represents a "sign" in a different spheres.
 *
 * @author Roma Bondarenko
 */
public class Sign implements Leaf {
    private final String value;

    public Sign(String value) {
        this.value = value;
    }

    @Override
    public void show() {
        System.out.print(" " + value + " ");
    }
}
