package ru.job4j.condition;

/**
 * Вычисление площади треугольника
 * Class Triangle
 * @author Oleg Krymov
 * @since 16.06.2019
 * version 1
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод period вычисляющий значение полупериметра по длинам сторон.
     * Формула.
     * (a + b + c) / 2
     * @param a расстояние между точками ap и bp
     * @param b расстояние между точками ap и cp
     * @param c расстояние между точками bp и cp
     * @return полупериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * Метод area вычисляет прощадь треугольканика.
     * Формула.
     * √ p *(p - a) * (p - b) * (p - c)
     * где √ - корень квадратный.
     * Метод distance класса Point вычисляет длины сторон треугольника.
     * Метод period вычисляет значение полупериметра треугольника.
     * @return возращает значение площади, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод exist проверяет можно ли построить треугольник с такими длинами сторон.
     * Треугольник можно построить при условии, что суммма длин любых двух его сторон
     * больше третьей.
     * @param a Длина от точки ap и bp.
     * @param b Длина от точки ap и cp.
     * @param c Длина от точки bp и cp.
     * @return значения истина или ложь возможности построения треугольника.
     */
    public boolean exist(double a, double b, double c) {
        return a < (b + c) && b < (a + c) && c < (a + b);
    }
}


