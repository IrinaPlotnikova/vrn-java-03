package ru.dataart.academy.java.figures;

public class Rectangle extends Figure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        setSideA(sideA);
        setSideB(sideB);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = Math.max(0, sideA);
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = Math.max(0, sideB);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}
