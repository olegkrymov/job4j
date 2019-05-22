package ru.job4j.array;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;

/**
 * Тесты для метода remove класса ArrayDuplicate.
 * Class ArrayDuplicateTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 22.05.2019
 */
public class ArrayDuplicateTest {

    /**
     * Test метода remove, при условии, что он принимает в себя массив строк
     * {"Мама", "Мама", "раму", "мыла", "мыла", "раму"}
     * Метод возвращает массив
     * {"Мама", "мыла", "раму"}
     * Т.к. по условию зодачи порядок элементов в массиве неважен, то
     * то для тестирования мы используем метод arrayContainingInAnyOrder.
     * он позволяет не соблюдать порядок строк в массиве
     * вывод результата работы метода в консоль демонстрирует это.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate removeDuplicates = new ArrayDuplicate();
        String[] input = {"Мама", "Мама", "раму", "мыла", "мыла", "раму"};
        String[] except = {"Мама", "мыла", "раму"};
        String[] result = removeDuplicates.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
        System.out.println(Arrays.toString(result));
    }

    /**
     * Test метода remove, при условии, что он принимает в себя массив строк
     * {"Мама", "мыла", "Мама", "раму", "мыла", "Мама"}
     * Метод возвращает массив
     * {"Мама", "мыла", "раму"}
     * При использовании в тестировании метода is мы должны соблюдать порядок строк в массиве
     * Тест проходит, только при соответствии порядка строк except и result
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicateOder() {
        ArrayDuplicate removeDuplicates = new ArrayDuplicate();
        String[] input = {"Мама", "мыла", "Мама", "раму", "мыла", "Мама"};
        String[] except = {"Мама", "мыла", "раму"};
        String[] result = removeDuplicates.remove(input);
        assertThat(result, is(except));
        System.out.println(Arrays.toString(result));
    }
}