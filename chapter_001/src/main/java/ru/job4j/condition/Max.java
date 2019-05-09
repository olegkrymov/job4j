package ru.job4j.condition;

/**
 * Вычисление максимума из двух чисел
 * Class Max
 * @author Oleg Krymov
 * @since 09.05.2019
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
}
