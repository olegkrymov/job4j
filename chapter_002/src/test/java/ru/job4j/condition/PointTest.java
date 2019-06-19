package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for class Point.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 2
 * @since 17.06.2019
 */
public class PointTest {

    /**
     * Test методов distance и info с выводом нв консоль координат заданнных точек
     * и результата вычисления.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Test метода distance, который считает расстояния от точки до самой себя.
     */
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    /**
     * Test метода info.
     */
    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }

    /**
     * Test методов distance3d и info3d с выводом нв консоль координат заданнных точек
     * и результата вычисления.
     */
    @Test
    public void whenZeroAndTenThenTenThreeD() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 10);
        double result = first.distance3d(second);
        first.info3d();
        second.info3d();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    /**
     * Test метода distance3d, который считает расстояния от точки до самой себя.
     */
    @Test
    public void whenCheckItselfThreeD() {
        Point point = new Point(0, 0, 0);
        double result = point.distance3d(point);
        assertThat(result, is(0D));
    }

    /**
     * Test метода info3d.
     */
    @Test
    public void whenShowInfoTreeD() {
        Point first = new Point(1, 1, 1);
        first.info3d();
        Point second = new Point(2, 2, 2);
        second.info3d();
    }
}