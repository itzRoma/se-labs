package com.lab111.labwork2;

/**
 * Class "Cl2" implements interface "If2"
 *
 * @author Roman Bondarenko
 */
public class Cl2 implements If2 {
    /**
     * Field of "If1" type
     */
    private If1 if1;

    /**
     * Realization of method "meth2"
     * from interface "If2"
     *
     * Method will print information about itself
     */
    @Override
    public void meth2() {
        System.out.println("Cl2.meth2");
    }
}
