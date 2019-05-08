package ru.job4j.calculator;

/**
 * Калькулятор.
 * Class Calculator
 * @author Oleg Krymov
 * @since 08.05.2019
 * version 1
 */
public class Calculator {

    /**
     * Сложение.
     * @param first первое слагаемое.
     * @param second второе слагаемое.
     * @return сумма чисел.
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Вычитание.
     * @param first уменьшаемое.
     * @param second вычитаемое.
     * @return разность чисел.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Деление.
     * @param first делимое.
     * @param second делитель.
     * @return частное чисел.
     */
    public  double div(double first, double second) {
        return first / second;
    }

    /**
     * Умножение.
     * @param first первый множитель.
     * @param second второйй множитель.
     * @return произведение чисел.
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}