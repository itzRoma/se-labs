package com.lab111.labwork7;

/**
 * Class which acts as a request.
 *
 * @author Roma Bondarenko
 */
public class Request extends Queue {
    private final String name;

    public Request(String name) {
        this.name = name;
    }

    public void exclusion() {
        System.out.println("Method name: exclusion. Request name: " + name);
    }

    public void changePriority() {
        System.out.println("Method name: changePriority. Request name: " + name);
    }
}