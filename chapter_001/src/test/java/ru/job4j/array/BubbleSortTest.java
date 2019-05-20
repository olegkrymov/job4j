package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода sort класса BubbleSort.
 * Class BubbleSortTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 20.05.2019
 */
public class BubbleSortTest {

    /**
     * Test метода sort, при условии, что он принимает в себя массив неотсортированных
     * целых чисел из 10 элементов{1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
     * Метод возвращает массив отсортированный по возрастанию методом пузырька
     * {0, 1, 1, 2, 3, 4, 5, 5, 7, 8}.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));
    }

    /**
     * Test метода sort, при условии, что он принимает в себя массив неотсортированных
     * целых чисел из 11 элементов{7, 5, 14, 11, 8, 1, 3, 17, 0, 4}.
     * Метод возвращает массив отсортированный по возрастанию методом пузырька
     * {0, 1, 3, 4, 5, 7, 8, 11, 14, 17}.
     */
    @Test
    public void whenSortArrayWithElevenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {7, 5, 14, 11, 8, 1, 3, 17, 0, 4};
        int[] result = bubbleSort.sort(input);
        int[] expect = new int[] {0, 1, 3, 4, 5, 7, 8, 11, 14, 17};
        assertThat(result, is(expect));
    }
}
