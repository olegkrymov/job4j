package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test for class Calculator.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 08.05.2019
 */
public class CalculatorTest {

    /**
     * Test метода add(сложение).
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test метода subtract(вычитание).
     */
    @Test
    public void whenSubtractTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        double result = calc.subtract(2D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Test метода div(деление).
     */
    @Test
    public void whenDivTwoOnOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.div(2D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test метода multiple(умножение).
     */
    @Test
    public void whenMultipleTwoOnOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}