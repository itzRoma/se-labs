package com.lab111.labwork6;

/**
 * A class that implements a specific strategy must inherit this interface,
 * an array class uses this interface to call a specific strategy.
 *
 * @author Roma Bondarenko
 */
public interface SortingStrategy {
    void sort(Integer[] array, Direction direction);
}
