package com.lab111.labwork2;

/**
 * Class "Cl1" extends class "Cl2"
 * and implements interface "If1"
 *
 * @author Roman Bondarenko
 */
public class Cl1 extends Cl2 implements If1 {
    /**
     * Field of "Cl1" type
     */
    private Cl1 cl1;

    /**
     * Realization of method "meth1"
     * from interface "If1"
     *
     * Method will print information about itself
     */
    @Override
    public void meth1() {
        System.out.println("Cl1.meth1");
    }

    /**
     * Realization of method "meth3"
     * from interface "If3"
     *
     * Method will print information about itself
     */
    @Override
    public void meth3() {
        System.out.println("Cl1.meth3");
    }
}
