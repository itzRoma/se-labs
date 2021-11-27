package com.lab111.labwork8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class that represents a folder object which can contain inner filesystem objects itself.
 *
 * @author Roma Bondarenko
 */
public class Folder implements Cloneable {
    private final ArrayList<Cloneable> included_objects;
    private final int depth;
    private final String name;

    public Folder(int d, String n, Cloneable[] objects) {
        depth = d;
        name = n;
        included_objects = new ArrayList<>();
        Collections.addAll(included_objects, objects);
    }

    public void addComponents(Cloneable[] objects) {
        Collections.addAll(included_objects, objects);
    }

    public int getDepth() {
        return depth;
    }

    public String getName() {
        return name;
    }

    @Override
    public Folder clone() {
        Cloneable[] array = new Cloneable[included_objects.size()];
        array = included_objects.toArray(array);
        return new Folder(depth, name, array);
    }
}