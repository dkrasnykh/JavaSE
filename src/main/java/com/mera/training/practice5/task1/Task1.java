package com.mera.training.practice5.task1;

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Rectangle(2, 2, 5, 5);
        figures[1] = new Circle(0, 0, 1);
        figures[2] = new Rectangle(-2, -2, 1, 1);
        figures[3] = new Circle(-1, 5, 6);
        figures[4] = new Rectangle(2, -2, 8, 8);
        for (Figure figure : figures) {
            System.out.printf("%s - %.2f%n", figure.getClass().getSimpleName(), figure.square());
        }
    }
}
