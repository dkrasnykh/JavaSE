package com.mera.training.practice5.task1;

public class Circle extends Figure {
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        if (radius < 0 || radius >= 10) {
            throw new IllegalArgumentException("Радиус должен принимать значения от 0 до 10.");
        }
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
