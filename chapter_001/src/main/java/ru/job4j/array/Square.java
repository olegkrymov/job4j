package ru.job4j.array;

/**
 * Заполнение массива числами, возведенными в квадрат.
 * Class Square
 * @author Oleg Krymov
 * @since 18.05.2019
 * version 1
 */
public class Square {

    /**
     * Метод calculate заполняет  массив размером bound элементами от 1 до bound возведенными в квадрат.
     * @param bound размер массива.
     * @return rst массив заполненный элементами от 1 до bound возведенными в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index != rst.length; index++) {
           rst[index] = (int) Math.pow(index + 1, 2);
        }
        return rst;
    }
}
