package com.mera.training.practice5.task1;

public abstract class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double square();

    public Quadrant getQuadrant() {
        if (x > 0 && y > 0) {
            return Quadrant.I;
        } else if (x < 0 && y > 0) {
            return Quadrant.II;
        } else if (x < 0 && y < 0) {
            return Quadrant.III;
        } else if (x > 0 && y < 0) {
            return Quadrant.IV;
        }
        return null;
    }
}
