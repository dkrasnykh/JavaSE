package com.mera.training.practice5.task1;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        if ((width < 0 || width >= 20) || (height < 0 || height >= 20)) {
            throw new IllegalArgumentException("Параметры 'ширина' и 'высота' должны принимать значения от 0 до 20");
        }
        this.height = height;
        this.width = width;
    }

    @Override
    public double square() {
        return width * height;
    }
}
