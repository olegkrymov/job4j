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
     * @param array массив неотсортированных целых чисел.
     * @return array массив отсортированный по возрастанию.
     */
    public int[] sort(int[] array) {

        // Внешний цикл каждый раз сокращает фрагмент массива,
        // так как внутренний цикл каждый раз ставит в конец
        // максимальный элемент
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                //Сравниваем элементы попарно,
                //если они имеют неправильный порядок,
                //то меняем местами
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}


