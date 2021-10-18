package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.println("Task for Java OOP");

        Figure[] figures = new Figure[]{
                new Circle(8),
                new Rectangle(9, 10),
                new Circle(6),
                new Rectangle(2,5)
        };

        Calculator calculator = new Calculator();
        double sum = calculator.sumOfAreas(figures);
        System.out.println("Sum = " + sum);  // 414.1592653589793
    }
}