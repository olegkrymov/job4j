package ru.job4j.condition;


import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
/**
 * Тест для класса Triangle.
 * Class TriangleTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 10.05.2019
 */
public class TriangleTest {
    /**
     * Test метода area.
     */
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        // Создаем объект треугольник.
        Triangle triangle = new Triangle();
        // Вычисляем площадь.
        double result = triangle.area(0, 0, 0, 2, 2, 0);
        // Задаем ожидаемый результат.
        double expected = 2D;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }

    /**
     * Test метода exist.
     * Треугольник создать невозможно.
     * Сумма двух сторон равна третьей.
     */
    @Test
    public void whenThreeTwoOne() {
        Triangle triangle = new Triangle();
        assertFalse(triangle.exist(3, 2, 1));
    }

    /**
     * Test метода exist.
     * Треугольник создать невозможно.
     * Сумма двух сторон равна третьей.
     */
    @Test
    public void whenOneTooTree() {
        Triangle triangle = new Triangle();
        assertFalse(triangle.exist(1, 2, 3));
    }

    /**
     * Test метода exist.
     * Треугольник создать невозможно.
     * Сумма двух сторон равна третьей.
     */
    @Test
    public void whenTooOneTree() {
        Triangle triangle = new Triangle();
        assertFalse(triangle.exist(2, 1, 3));

    }

    /**
     * Test метода exist.
     * Треугольник создать невозможно.
     * Сумма двух сторон равна третьей.
     */
    @Test
    public void whenTooTreeOne() {
        Triangle triangle = new Triangle();
        assertFalse(triangle.exist(2, 3, 1));
    }

    /**
     * Test метода exist.
     * Треугольник создать невозможно.
     * Сумма двух сторон меньше третьей.
     */
    @Test
    public void whenOneTreeOne() {
        Triangle triangle = new Triangle();
        assertFalse(triangle.exist(1, 3, 1));
    }

    /**
     * Test метода exist.
     * Треугольник создать возможно.
     * Сумма любых двух сторон больше третьей.
     */
    @Test
    public void whenFiveFourTree() {
        Triangle triangle = new Triangle();
        assertTrue(triangle.exist(5, 4, 3));
    }

    /**
     * Test метода period.
     */
    @Test
    public void whenTreeFourFive() {
        Triangle triangle = new Triangle();
        double result = triangle.period(3, 4, 5);
        // Задаем ожидаемый результат.
        double expected = 6;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(expected, 0.1));
    }
}
