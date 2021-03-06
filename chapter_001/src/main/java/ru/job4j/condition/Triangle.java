package ru.job4j.condition;

/**
 * Вычисление площади треугольника
 * Class Triangle
 * @author Oleg Krymov
 * @since 10.05.2019
 * version 1
 */
public class Triangle {
    /**
     * Метод period вычисляющий значение полупериметра по длинам сторон.
     * Формула.
     * (a + b + c) / 2
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
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
     * @param x1,y1,x2,y2,x3,y3 координаты трех вершин треугольника в системе координат.
     * Метод distance класса Point вычисляет длины сторон треугольника.
     * Метод period вычисляет значение полупериметра треугольника.
     * @return возращает значение площади, если треугольник существует или -1.
     */
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
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
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return значения истина или ложь возможности построения треугольника.
     */
    public boolean exist(double a, double b, double c) {
        return a < (b + c) && b < (a + c) && c < (a + b);
    }
}
