package com.tw.bootcamp.problem1;

public class Rectangle {
    private final double width;
    private final double height;

    private Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public static Rectangle createRectangle(double width, double height) {
        return new Rectangle(width, height);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side, side);
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
