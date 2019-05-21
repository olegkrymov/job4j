package ru.job4j.array;

/**
 * Двухмерный массив. Таблица умножения.
 * Class Matrix
 * @author Oleg Krymov
 * @since 21.05.2019
 * version 1
 */
public class Matrix {

    /**
     * Метод multiple заполняет матрицу - двухменый массив,
     * где количество ячеек равно количеству элементов во вложенном массиве,
     * размером size элементами таблицы умножения.
     * @param size размер матрицы.
     * @return table матрица(массив) заполненная элементами таблицы умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
