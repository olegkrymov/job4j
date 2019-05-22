package ru.job4j.array;

import java.util.Arrays;

/**
 * Удаление дубликатов в массиве
 * Class ArrayDuplicate
 * @author Oleg Krymov
 * @since 22.05.2019
 * version 1
 */
public class ArrayDuplicate {
    /**
     * Метод remove который принимает в себя массив строк
     * и убирает все дубликаты строк из массива.
     * @param array массив строк
     * @return массив обрезанный с учетом колличества найденных дубликатов
     */
    public String[] remove(String[] array) {
        int unique = array.length;

        // с помощью операторов for внешнего и внутреннего мы последовательно
        // сравниваем сначала первый элемент массива с последующими, затем второй и т.д.
        for (int out = 0; out != unique; out++) {
            for (int inner = out + 1; inner != unique; inner++) {

                //при нахождении дубликата мы присваеваем ему значение последнего элемента
                //массива и одновременно уменьшаем значение unique на 1( "обрезаем" наш массив)
                //и уменьшаем на 1 внутренний «счетчик», чтобы сранить на совпадение новое значение.
                if (array[out].equals(array[inner])) {
                    array[inner] = array[unique - 1];
                    unique--;
                    inner--;
                }
            }
        }
        // с помощью метода Arrays.copyOf "обрезаем" массив до значения unique
        //с учетом найденных дубликатоа
     return Arrays.copyOf(array, unique);
    }
}
