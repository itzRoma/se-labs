package com.lab111.labwork8;

/**
 * Class for testing labwork8.
 *
 * @author Roma Bondarenko
 */
public class Test400 {
    public static void main(String[] args) {
        File file1 = new File(1, "Test.java");
        File file2 = new File(2, "Car.java");
        File file3 = new File(3, "Wheel.java");

        Folder folder = new Folder(1, "Project", new Cloneable[]{
                file1,
                file2,
                file3
        });

        Folder cloned = folder.clone();
        System.out.println("Depth of cloned folder: " + cloned.getDepth() +
                "\nDepth of original folder: " + folder.getDepth());
    }
}