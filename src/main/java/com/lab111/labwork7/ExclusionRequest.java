package com.lab111.labwork7;

/**
 * Concrete command classes and implementing Order interface
 * which will do actual command processing.
 *
 * @author Roma Bondarenko
 */
public class ExclusionRequest implements Order {
    private Request request;

    public ExclusionRequest(Request request) {
        this.request = request;
    }

    @Override
    public void execute() {
        request.exclusion();
    }
}