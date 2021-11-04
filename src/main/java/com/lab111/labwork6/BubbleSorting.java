package com.lab111.labwork6;

/**
 * Class that implements "SortingStrategy" interface
 * and realize "sort" method using bubble sorting.
 *
 * @author Roma Bondarenko
 */
public class BubbleSorting implements SortingStrategy {
    @Override
    public void sort(Integer[] array, Direction direction) {
        System.out.println("Bubble sorting...");
        if (direction == Direction.ASCENDING) {
            sortAsc(array);
        } else if (direction == Direction.DESCENDING) {
            sortDes(array);
        }
    }

    private void sortAsc(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private void sortDes(Integer[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}