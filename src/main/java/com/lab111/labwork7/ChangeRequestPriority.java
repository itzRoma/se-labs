package com.lab111.labwork7;

/**
 * Concrete command classes and implementing Order interface
 * which will do actual command processing.
 *
 * @author Roma Bondarenko
 */
public class ChangeRequestPriority implements Order {
    private Request request;

    public ChangeRequestPriority(Request request) {
        this.request = request;
    }

    public void execute() {

        request.changePriority();
    }
}