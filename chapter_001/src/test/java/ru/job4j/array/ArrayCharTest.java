package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода startsWith класса ArrayChar.
 * Class ArrayCharTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 20.05.2019
 */
public class ArrayCharTest {

    /**
     * Test метода startsWith, при условии, что начальные символы соответствуют префиксу.
     * Метод возвращает true.
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    /**
     * Test метода startsWith, при условии, что начальные символы не соответствуют префиксу.
     * Метод возвращает false.
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }

    /**
     * Test метода startsWith, при условии, что начальные символы соответствуют префиксу.
     * Метод возвращает true.
     */
    @Test
    public void whenStartWithPrefixThenTrueRu() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Привет", "При");
        assertThat(result, is(true));
    }

    /**
     * Test метода startsWith, при условии, что начальные символы не соответствуют префиксу.
     * Метод возвращает false.
     */
    @Test
    public void whenNotStartWithPrefixThenFalseRu() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Привет", "Пре");
        assertThat(result, is(false));
    }
}
