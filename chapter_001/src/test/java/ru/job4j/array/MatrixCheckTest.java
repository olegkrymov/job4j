package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода mono класса MatrixCheck.
 * Class MatrixCheckTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 21.05.2019
 */
public class MatrixCheckTest {

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с нечетным колличеством элементов
     * {true, true, true},
     * {false, true, true},
     * {true, false, true}.
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с нечетным колличеством элементов
     * {true, true, false},
     * {false, false, true},
     * {true, false, true}
     * Метод возвращает false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с четным колличеством элементов
     * {true, true, true, false},
     * {false, true, false, false},
     * {true, false, true, false},
     * {false, false, true, true}.
     * Т.к. диагонали не содержат общих ячеек, они могут быть разными по значению
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByTrueThenTrueEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, false},
                {false, true, false, false},
                {true, false, true, false},
                {false, false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с четным колличеством элементов
     * {true, false, true, true},
     * {false, true, true, false},
     * {false, true, true, false},
     * {true, false, false, true}.
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByTrueThenTrueEvenAll() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, false, true, true},
                {false, true, true, false},
                {false, true, true, false},
                {true, false, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с четным колличеством элементов
     * {true, true, true, false},
     * {false, true, false, false},
     * {true, true, true, false},
     * {false, false, true, true}.
     * Метод возвращает false.
     */
    @Test
    public void whenDataMonoByTrueThenFalseEven() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true, false},
                {false, true, false, false},
                {true, true, true, false},
                {false, false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }



}
