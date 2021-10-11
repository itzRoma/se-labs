package com.lab111.labwork4;

public class Circle implements Figure {
    private double phi;
    private double rho;

    public Circle(double phi, double rho) {
        this.phi = phi;
        this.rho = rho;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getRho() {
        return rho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    @Override
    public void draw() {

    }
}
