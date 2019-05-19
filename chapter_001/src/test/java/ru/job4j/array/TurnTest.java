package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода back класса Turn.
 * Class TurnTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 19.05.2019
 */
public class TurnTest {

    /**
     * Test метода back, при условии, что он принимает в себя массив четного колличества элементов
     * целых чисел {4, 1, 6, 2}.
     * Метод возвращает массив в обратном порядке  {2, 6, 1, 4}.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * Test метода back, при условии, что он принимает в себя массив нечетного колличества элементов
     * целых чисел {5, 1, 4, 9, 8, 3, 7}.
     * Метод возвращает массив в обратном порядке {7, 3, 8, 9, 4, 1, 5}.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {5, 1, 4, 9, 8, 3, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 3, 8, 9, 4, 1, 5};
        assertThat(result, is(expect));
    }
}
