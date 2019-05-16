package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест для класса Counter.
 * Class CounterTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 16.05.2019
 */

public class CounterTest {

    /**
     * Test метода add, проверяющий, что сумма чётных чисел
     * от 1 до 10 при вызове метода counter.add будет равна 30.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }

    /**
     * Test метода add, проверяющий, что сумма чётных чисел
     * от 57 до 72 при вызове метода counter.add будет равна 30.
     */
    @Test
    public void whenSumEvenNumbersFrom57To72Then520() {
        Counter counter = new Counter();
        int result = counter.add(57, 72);
        assertThat(result, is(520));
    }

    /**
     * Test метода add, проверяющий, что если первое число диапозона больше последнего,
     * то сумма чётных чисел при вызове метода counter.add будет равна 0.
     */
    @Test
    public void whenSumEvenNumbersStartGreaterFinish() {
        Counter counter = new Counter();
        int result = counter.add(27, 15);
        assertThat(result, is(0));
    }

    /**
     * Test метода add, проверяющий, что если первое число диапозона равно последнему и они четные,
     * то сумма чётных чисел при вызове метода counter.add будет равна этому числу.
     */
    @Test
    public void whenSumEvenNumbersStartEqualFinishEven() {
        Counter counter = new Counter();
        int result = counter.add(44, 44);
        assertThat(result, is(44));
    }

    /**
     * Test метода add, проверяющий, что если первое число диапозона равно последнему и они нечетные,
     * то сумма чётных чисел при вызове метода counter.add будет равна 0.
     */
    @Test
    public void whenSumEvenNumbersStartEqualFinishUneven() {
        Counter counter = new Counter();
        int result = counter.add(45, 45);
        assertThat(result, is(0));
    }
}
