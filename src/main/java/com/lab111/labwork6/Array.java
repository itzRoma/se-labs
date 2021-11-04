package com.lab111.labwork6;

import java.util.Arrays;

/**
 * Class represents an array of integers.
 *
 * @author Roma Bondarenko
 */
public class Array {
    private final Integer[] numbers;

    public Array(Integer...numbers) {
        this.numbers = numbers;
    }

    public void sort(SortingStrategy strategy, Direction direction) {
        strategy.sort(numbers, direction);
    }

    public void show() {
        System.out.println(Arrays.toString(numbers));
    }
}
