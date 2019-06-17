package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Вычисление расстояния между двумя точками в системе координат
 * Class Point
 * @author Oleg Krymov
 * @since 17.06.2019
 * version 2
 */
public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата x
     * @param second координата y
     */
     public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Перегружаем конструктор Point
     * Он принимает три координаты
     * @param x координата x
     * @param y координата y
     * @param z координата z
     */
     public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {

        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt((pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2)));
    }

    public void info() {

        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }

    public void info3d() {

        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
}
