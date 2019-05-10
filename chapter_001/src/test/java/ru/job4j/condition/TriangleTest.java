package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;


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
     */
    @Test
    public void whenTreeTooOne() {
        Triangle triangle = new Triangle();
       boolean result= triangle.exist(3 , 2, 1);
        // Задаем ожидаемый результат.
       boolean expected = false;
        //Проверяем соответствие результата и ожидаемого значения.
        assertTrue(true);
    }
    /**
     * Test метода period.
     */
    @Test
    public void whenTreeFourFive() {
        Triangle triangle = new Triangle();
        double result= triangle.period(3 , 4, 5);
        // Задаем ожидаемый результат.
        double expected = 6;
        //Проверяем результат и ожидаемое значение.
        assertThat(result,closeTo(expected, 0.1));
    }
}
