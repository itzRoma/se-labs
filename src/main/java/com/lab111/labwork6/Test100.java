package com.lab111.labwork6;

/**
 * Class for testing labwork6.
 *
 * @author Roma Bondarenko
 */
public class Test100 {
    public static void main(String[] args) {
        Array numbers = new Array(1, 5, 3, 7, 3, 2, 9);
        numbers.show();
        numbers.sort(new BubbleSorting(), Direction.ASCENDING);
        numbers.show();
    }
}
