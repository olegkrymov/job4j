package ru.job4j.exam;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода merge класса Merge.
 * Class MergeTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 30.05.2019
 */
public class MergeTest {
    /**
     * Тест для метода merge
     */
    @Test
    public void whenBothEmpty() {
        Merge algo = new Merge();
        int[] expect = new int[0];
        int[] result = algo.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    /**
     * Тест для метода merge
     */
    @Test
    public void whenAscOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Тест для метода merge
     */
    @Test
    public void whenLeftLess() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = algo.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Тест для метода merge
     */
    @Test
    public void whenLeftGreat() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = algo.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Тест для метода merge
     */
    @Test
    public void whenLeftEmpty() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    /**
     * Тест для метода merge
     */
    @Test
    public void whenAscNoOrder() {
        Merge algo = new Merge();
        int[] expect = {1, 2, 3, 4, 5, 7, 10};
        int[] result = algo.merge(
                new int[] {1, 10},
                new int[] {2, 3, 4, 5, 7}
        );
        assertThat(result, is(expect));
    }
}