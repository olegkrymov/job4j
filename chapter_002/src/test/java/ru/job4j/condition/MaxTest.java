package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Тесткласс для класса Max
 * Class MaxTest
 * @author Oleg Krymov
 * @since 17.06.2019
 * version 1
 */
public class MaxTest {
    /**
     * Тест метода max для двух чисел.
     * Максимум второе число.
     */
    @Test
    public void whenMaxSecondInTwo() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Тест метода max для двух чисел.
     * Максимум первое число.
     */
    @Test
    public void whenMaxFirstInTwo() {
        Max max = new Max();
        int result = max.max(3, 2);
        assertThat(result, is(3));
    }

    /**
     * Тест метода max для двух чисел
     * Числа равны.
     */
    @Test
    public void whenEveryTwoIsEqual() {
        Max max = new Max();
        int result = max.max(4, 4);
        assertThat(result, is(4));
    }

    /**
     * Тест метода max для трех чисел.
     * Максимум второе число.
     */
    @Test
    public void whenMaxSecondInTree() {
        Max max = new Max();
        int result = max.max(1, 2, 0);
        assertThat(result, is(2));
    }

    /**
     * Тест метода max для трех чисел.
     * Максимум первое число.
     */
    @Test
    public void whenMaxFirstInTree() {
        Max max = new Max();
        int result = max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    /**
     * Тест метода max для трех чисел.
     * Максимум третье число.
     */
    @Test
    public void whenMaxThirdInTree() {
        Max max = new Max();
        int result = max.max(3, 2, 5);
        assertThat(result, is(5));
    }

    /**
     * Тест метода max для трех чисел
     * Все числа равны.
     */
    @Test
    public void whenEveryTreeIsEqual() {
        Max max = new Max();
        int result = max.max(4, 4, 4);
        assertThat(result, is(4));
    }

    /**
     * Тест метода max для четырех чисел.
     * Максимум второе число.
     */
    @Test
    public void whenMaxSecondInFour() {
        Max max = new Max();
        int result = max.max(1, 4, 0, 3);
        assertThat(result, is(4));
    }

    /**
     * Тест метода max для четырех чисел.
     * Максимум первое число.
     */
    @Test
    public void whenMaxFirstInFour() {
        Max max = new Max();
        int result = max.max(3, 2, 1, 0);
        assertThat(result, is(3));
    }

    /**
     * Тест метода max для четырех чисел.
     * Максимум третье число.
     */
    @Test
    public void whenMaxThirdInFour() {
        Max max = new Max();
        int result = max.max(3, 2, 5, 1);
        assertThat(result, is(5));
    }

    /**
     * Тест метода max для четырех чисел.
     * Максимум третье число.
     */
    @Test
    public void whenMaxFourthInFour() {
        Max max = new Max();
        int result = max.max(3, 2, 5, 7);
        assertThat(result, is(7));
    }

    /**
     * Тест метода max для четырех чисел
     * Все числа равны.
     */
    @Test
    public void whenEveryFourIsEqual() {
        Max max = new Max();
        int result = max.max(7, 7, 7, 7);
        assertThat(result, is(7));
    }
}