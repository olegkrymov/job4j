package ru.job4j.condition;

/**
 * Вычисление максимума из двух, трех и четырех чисел
 * Class Max
 * @author Oleg Krymov
 * @since 17.06.2019
 * version 1
 */
public class Max {

    /**
     * Метод max возвращает максимальное число из first и second.
     * @param first первое число.
     * @param second второе число.
     * @return максимум из двух чисел.
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }

    /**
     * Метод max возвращает максимальное число из first, second и third.
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @return максимум из трех чисел.
     */
    public int max(int first, int second, int third) {
        return max(first, second) >= third ? max(first, second) : third;
    }

    /**
     * Метод max возвращает максимальное число из first, second, third и four .
     * @param first первое число.
     * @param second второе число.
     * @param third третье число.
     * @param four четвертое число.
     * @return максимум из четырех чисел.
     */
    public int max(int first, int second, int third, int four) {
        return max(first, second,third) >= four ? max(first, second, third) : four;
    }
}
