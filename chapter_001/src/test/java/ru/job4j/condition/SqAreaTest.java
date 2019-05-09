package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
/**
 * Тест для класса SqArea.
 * Class SqAreaTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 09.05.2019
 */
public class SqAreaTest {
    /**
     * Test метода square.
     */
    @Test
    public void p4k1s1() {
        SqArea area = new SqArea();
        int result = area.square(4, 1);
        assertThat(result, is(1));
    }

    /**
     * Test метода square.
     */
    @Test
    public void p6k2s2() {
        SqArea area = new SqArea();
        int result = area.square(6, 2);
        assertThat(result, is(2));
    }
}
