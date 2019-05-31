package ru.job4j.exam;

/**
 * Слияние двух отсортированных массивов
 * Class Merge
 * @author Oleg Krymov
 * @since 30.05.2019
 * version 1
 */
public class Merge {

    /**
     * Метод merge, который принимает в себя два отсортированных массива целых чисел, и возвращает отсортированный
     * массив, размером равным сумме размеров принимаемых массивов и содержащий их значения.
     * @param left массив целых чисел.
     * @param right массив целых чисел
     * @return rsl массив целых чисел(слияние массивов left и right).
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int res = 0, i = 0, j = 0;
        while (i < left.length && j < right.length) {
            rsl[res++] = left[i] < right[j] ? left[i++] : right[j++];
        }
        while (i < left.length || j < right.length) {
            rsl[res++] = i < left.length ? left[i++] : right[j++];
        }
        return rsl;
    }
}
