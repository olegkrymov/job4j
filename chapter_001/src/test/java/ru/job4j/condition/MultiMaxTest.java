package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тест для класса MultiMax.
 * Class MultiMaxTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 11.05.2019
 */
public class MultiMaxTest {

    /**
     * Test метода max.
     * Максимум второе число.
     */
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test метода max.
     * Максимум первое число.
     */
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 4, 2);
        assertThat(result, is(7));
    }

    /**
     * Test метода max.
     * Максимум третье число.
     */
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 5);
        assertThat(result, is(5));
    }

    /**
     * Test метода max.
     * Все числа равны.
     */
    @Test
    public void whenAllEqual() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 4, 4);
        assertThat(result, is(4));
    }

    /**
     * Test метода maxMax.
     * Максимум второе число.
     */
    @Test
    public void whenSecondMaxMax() {
        MultiMax check = new MultiMax();
        int result = check.maxMax(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test метода maxMax.
     * Максимум первое число.
     */
    @Test
    public void whenFirstMaxMax() {
        MultiMax check = new MultiMax();
        int result = check.maxMax(7, 4, 2);
        assertThat(result, is(7));
    }

    /**
     * Test метода maxMax.
     * Максимум третье число.
     */
    @Test
    public void whenThirdMaxMax() {
        MultiMax check = new MultiMax();
        int result = check.maxMax(1, 4, 5);
        assertThat(result, is(5));
    }

    /**
     * Test метода maxMax.
     * Все числа равны.
     */
    @Test
    public void whenAllEqualMax() {
        MultiMax check = new MultiMax();
        int result = check.maxMax(4, 4, 4);
        assertThat(result, is(4));
    }

    /**
     * Test метода maxIf.
     * Максимум второе число.
     */
    @Test
    public void whenSecondMaxIf() {
        MultiMax check = new MultiMax();
        int result = check.maxIf(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test метода maxIf.
     * Максимум первое число.
     */
    @Test
    public void whenFirstMaxIf() {
        MultiMax check = new MultiMax();
        int result = check.maxIf(7, 4, 2);
        assertThat(result, is(7));
    }

    /**
     * Test метода maxIf.
     * Максимум третье число.
     */
    @Test
    public void whenThirdMaxIf() {
        MultiMax check = new MultiMax();
        int result = check.maxIf(1, 4, 5);
        assertThat(result, is(5));
    }

    /**
     * Test метода maxIf.
     * Все числа равны.
     */
    @Test
    public void whenAllEqualIf() {
        MultiMax check = new MultiMax();
        int result = check.maxIf(4, 4, 4);
        assertThat(result, is(4));
    }

    /**
     * Test метода maxMath.
     * Максимум второе число.
     */
    @Test
    public void whenSecondMaxMath() {
        MultiMax check = new MultiMax();
        int result = check.maxMath(1, 4, 2);
        assertThat(result, is(4));
    }

    /**
     * Test метода maxMath.
     * Максимум первое число.
     */
    @Test
    public void whenFirstMaxMath() {
        MultiMax check = new MultiMax();
        int result = check.maxMath(7, 4, 2);
        assertThat(result, is(7));
    }

    /**
     * Test метода maxIf.
     * Максимум третье число.
     */
    @Test
    public void whenThirdMaxMath() {
        MultiMax check = new MultiMax();
        int result = check.maxMath(1, 4, 5);
        assertThat(result, is(5));
    }

    /**
     * Test метода maxMath.
     * Все числа равны.
     */
    @Test
    public void whenAllEqualMath() {
        MultiMax check = new MultiMax();
        int result = check.maxMath(4, 4, 4);
        assertThat(result, is(4));
    }
}
