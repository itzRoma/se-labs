package com.lab111.labwork8;

/**
 * Class tht represents a file and cannot contain inner objects.
 *
 * @author Roma Bondarenko
 */
public class File implements Cloneable {
    private final int depth;
    private final String name;

    public File(int d, String n) {
        depth = d;
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getDepth() {
        return depth;
    }

    @Override
    public File clone() {
        return new File(depth, name);
    }
}