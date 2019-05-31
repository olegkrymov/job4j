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
        for (int out = 0; out < size; out++) {
            for (int inner = 0; inner < size; inner++) {
                table[out][inner] = (out + 1) * (inner + 1);
            }
        }
        return table;
    }
}
