package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test for class Point.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 08.05.2019
 */
public class PointTest {
    /**
     * Test метода distance.
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}
