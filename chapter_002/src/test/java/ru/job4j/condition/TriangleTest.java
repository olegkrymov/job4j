package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * Тест для класса Triangle.
 * Class TriangleTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 16.06.2019
 */
public class TriangleTest {

    /**
     * Test метода area.
     * создаем три объекта класса Point.
     * Создаем объект треугольник и передаем в него объекты точек.
     * Вычисляем площадь.
     * Задаем ожидаемый результат.
     * Проверяем результат и ожидаемое значение.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Test метода area.
     * создаем три объекта класса Point.
     * Создаем объект треугольник и передаем в него объекты точек.
     * Треугольник создать невозможно.
     * Сумма двух сторон равна третьей.
     * Проверяем результат и ожидаемое значение.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleImpossible() {
        Point a = new Point(1, 2);
        Point b = new Point(4, 5);
        Point c = new Point(7, 8);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Test метода exist.
     * Создаем три объекта класса Point.
     * Создаем объект треугольник и передаем в него объекты точек.
     * Треугольник создать невозможно.
     * Сумма двух сторон равна третьей.
     * Проверяем результат и ожидаемое значение.
     */
    @Test
    public void whenThreeTwoOne() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 1);
        Point third = new Point(0, 3);
        Triangle triangle = new Triangle(first, second, third);
        assertFalse(triangle.exist(first.distance(second), first.distance(third), second.distance(third)));
    }
}