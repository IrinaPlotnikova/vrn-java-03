package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    // возвращает сумму площадей в массиве Figures
    public double sumOfAreas(Figure[] figures) {
        double result = 0;
        for (Figure figure : figures) {
            result += figure.calculateArea();
        }

        return result;
    }
}
