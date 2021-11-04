package com.lab111.labwork6;

import java.util.Arrays;
import java.util.Collections;

/**
 * Class that implements "SortingStrategy" interface
 * and realize "sort" method using quick sorting.
 *
 * @author Roma Bondarenko
 */
public class QuickSorting implements SortingStrategy {
    @Override
    public void sort(Integer[] array, Direction direction) {
        System.out.println("Quick sorting...");
        if (direction == Direction.ASCENDING) {
            Arrays.sort(array);
        } else if (direction == Direction.DESCENDING) {
            Arrays.sort(array, Collections.reverseOrder());
        }
    }
}
