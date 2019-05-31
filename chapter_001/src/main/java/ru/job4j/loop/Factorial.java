package ru.job4j.loop;

/**
 * Вычисление факториала.
 * Class Factorial.
 * @author Oleg Krymov
 * @since 16.05.2019
 * version 1
 */
public class Factorial {

    /**
     * Метод calc возвращает факториал числа n.
     * @param n положительное целое число.
     * @return факториал числа n.
     */
    public int calc(int n) {
        int result = 1;
        for (int mult = 1; mult <= n; mult++) {
            result *= mult;
        }
        return result;
    }
}
