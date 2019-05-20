package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода mono класса Check.
 * Class CheckTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 20.05.2019
 */
public class CheckTest {

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с нечетным колличеством элементов {true, true, true}.
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с нечетным колличеством элементов {false, false, false}.
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с нечетным колличеством элементов {true, false, true}.
     * Метод возвращает false.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с четным колличеством элементов {true, true, true, true}.
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByEvenTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с четным колличеством элементов {false, false, false, false}.
     * Метод возвращает true.
     */
    @Test
    public void whenDataMonoByEvenFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Test метода mono, при условии, что он принимает в себя  boolean массив
     * с четным колличеством элементов {true, false, false, true}.
     * Метод возвращает false.
     */
    @Test
    public void whenDataNotMonoEvenByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
