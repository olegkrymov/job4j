package ru.job4j.condition;

/**
 * Вычисление максимума из трёх чисел
 * Class MultiMax
 * @author Oleg Krymov
 * @since 11.05.2019
 * version 1
 */
public class MultiMax {

    /**
     * Метод max возвращает максимальное число из first, second и third .
     * Реализация с использованием тренарного оператора«?».
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимум из трех чисел.
     */
    public int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        return result >= third ? result : third;
    }

    /**
     * Метод maxMax возвращает максимальное число из first, second и third .
     * Реализация с использованием тренарного оператора«?» и метода max класса Max.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимум из трех чисел.
     */
    public int maxMax(int first, int second, int third) {
        return new Max().max(first,second) >= third ? new Max().max(first,second) : third;
    }

    /**
     * Метод maxIf возвращает максимальное число из first, second и third .
     * Реализация с использованием управляющего оператора условного выбора if-else-if.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимум из трех чисел.
     */
    public int maxIf(int first, int second, int third) {
        int result;
        if (first >= second && first >= third) {
            result = first;
        } else if (second >= first && second >= third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }

    /**
     * Метод maxMath возвращает максимальное число из first, second и third .
     * Реализация с использованием метода max класса Math.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимум из трех чисел.
     */
    public int maxMath(int first, int second, int third) {
        return Math.max(Math.max(first, second), third);
    }
}
