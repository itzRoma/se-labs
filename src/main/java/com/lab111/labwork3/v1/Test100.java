package com.lab111.labwork3.v1;

/**
 * Java class for testing labwork3.
 *
 * @author Roma Bondarenko
 */
public class Test100 {
    public static void main(String[] args) {
        Leaf two = new Constant(2);
        Leaf minus = new Sign("-");
        Leaf one = new Constant(1);
        Leaf equals = new Sign("=");

        Composite complex = new ComplexExpression(two, minus, one);
        Composite simple = new SimpleExpression(one);

        Composite expression = new ComplexExpression(complex, equals, simple);
        expression.show();
    }
}
