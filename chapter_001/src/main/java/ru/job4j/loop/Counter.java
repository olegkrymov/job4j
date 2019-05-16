package ru.job4j.loop;

/**
 * Подсчет суммы всех чётных чисел в заданном диапазоне.
 * Class Counter
 * @author Oleg Krymov
 * @since 16.05.2019
 * version 1
 */
public class Counter {

/**
 * Метод add вычисляет сумму всех четных чисел заданного диапозона.
 * @param start начало диапозона.
 * @param finish конец диапозона.
 * @return сумма всех четных чисел диапозона.
 */
        public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}





