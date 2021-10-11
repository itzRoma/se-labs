package com.lab111.labwork2;

/**
 * Class "Cl3" implements interface "If3"
 *
 * @author Roman Bondarenko
 */
public class Cl3 implements If3 {
    /**
     * Field of "Cl1" type
     */
    private Cl1 cl1;

    /**
     * Realization of method "meth2"
     * from interface "If2"
     *
     * Method will print information about itself
     */
    @Override
    public void meth2() {
        System.out.println("Cl3.meth2");
    }

    /**
     * Realization of method "meth3"
     * from interface "If3"
     *
     * Method will print information about itself
     */
    @Override
    public void meth3() {
        System.out.println("Cl3.meth3");
    }
}
