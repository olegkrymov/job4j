package ru.job4j.condition;

/**
 * Вычисление расстояния между двумя точками в системе координат
 * Class Point
 * @author Oleg Krymov
 * @since 08.05.2019
 * version 1
 */
public class Point {

    /**
     * метод distance вычисляющий расстояние между точками по формуле.
     * @param x1 координата по оси x первой точки.
     * @param y1 координата по оси y первой точки.
     * @param x2 координата по оси x второй точки.
     * @param y2 координата по оси y второй точки.
     * @return расстояние между двумя точками.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        return Math.sqrt(first + second);
    }
}
