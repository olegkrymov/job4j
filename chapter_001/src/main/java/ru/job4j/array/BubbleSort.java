package ru.job4j.array;

/**
 * Сртировки массива методом перестановки
 * Class BubbleSort
 * @author Oleg Krymov
 * @since 20.05.2019
 * version 1
 */
public class BubbleSort {

    /**
     * Метод sort, который принимает в себя массив неотсортированных целых чисел, а возвращает тот же самый массив,
     * отсортированный с помощью алгоритма пузырька.
     * Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец
     * максимальный элемент. Далее сравниваем элементы попарно, если они имеют неправильный порядок,
     * то меняем местами.
     * @param array массив неотсортированных целых чисел.
     * @return array массив отсортированный по возрастанию.
     */
    public int[] sort(int[] array) {
        for (int out = array.length - 1; out > 0; out--) {
            for (int inner = 0; inner < out; inner++) {
                if (array[inner] > array[inner + 1]) {
                    int tmp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = tmp;
                }
            }
        }
        return array;
    }
}



