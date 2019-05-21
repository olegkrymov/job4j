package ru.job4j.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты для метода multiple класса Matrix.
 * Class MatrixTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 21.05.2019
 */
public class MatrixTest {

    /**
     * Test метода multiple, проверяющий, что матрица размером 5
     * будет заполнена значениями таблицы умножения
     * {1, 2, 3, 4, 5},
     * {2, 4, 6, 8, 10},
     * {3, 6, 9, 12, 15},
     * {4, 8, 12, 16, 20},
     * {5, 10, 15, 20, 25}
     * с выводом результата в консоль.
     */
    @Test
    public void when5on5() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(5);
        int[][] expect = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertThat(table, is(expect));
        for (int index = 0; index != table.length; index++) {
            System.out.println(Arrays.toString(table[index]));
        }
    }

    /**
     * Test метода multiple, проверяющий, что матрица размером 2
     * будет заполнена значениями таблицы умножения
     * {1, 2},
     * {2, 4}
     * с выводом результата в консоль.
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
        for (int index = 0; index != table.length; index++) {
            System.out.println(Arrays.toString(table[index]));
        }
    }
}
