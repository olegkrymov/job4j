package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода calculate класса Square.
 * Class SquareTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 18.05.2019
 */
public class SquareTest {

    /**
     * Test метода calculate, проверяющий, что массив размером 3
     * будет заполнен значениями 1, 4, 9.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Test метода calculate, проверяющий, что массив размером 2
     * будет заполнен значениями 1, 4.
     */
    @Test
    public void whenBound2Then14() {
        int bound = 2;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4};
        assertThat(rst, is(expect));
    }

    /**
     * Test метода calculate, проверяющий, что массив размером 4
     * будет заполнен значениями 1, 4, 9, 16.
     */
    @Test
    public void whenBound4Then14916() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expect));
    }

    /**
     * Test метода calculate, проверяющий, что массив размером 5
     * будет заполнен значениями 1, 4, 9, 16, 25.
     */
    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }
}
