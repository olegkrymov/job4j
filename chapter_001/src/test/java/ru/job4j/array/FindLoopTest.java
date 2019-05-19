package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода indexOf класса FindLoop.
 * Class FindLoopTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 19.05.2019
 */
public class FindLoopTest {

    /**
     * Test метода indexOf, при условии, что мы ищем  индекс элемента равного 5
     * в массиве заполненном значениями 5, 10, 3.
     * Искомый элемент найден.
     * Метод возвращает значение индекса 0.
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Test метода indexOf, при условии, что мы ищем индекс элемента равного 4
     * в массиве заполненном значениями 5, 10, 3, 4.
     * Искомый элемент найден.
     * Метод возвращает значение индекса 3.
     */
    @Test
    public void whenArrayHas4Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 4};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Test метода indexOf, при условии, что мы ищем индекс элемента равного 4
     * в массиве заполненном значениями 5, 10, 3, 7.
     * Искомый элемент не найден.
     * Метод возвращает значение индекса -1.
     */
    @Test
    public void whenArrayHasNot4ThenMinusOne() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3, 7};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
