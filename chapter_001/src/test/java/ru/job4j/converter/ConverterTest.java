package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 08.05.2019
 */
public class ConverterTest {

    /**
     * Test rubleToEuro
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
    /**
     * Test rubleToDollar
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test euroToRuble
     */
    @Test
    public void when1EuroToRubleThen70() {
         Converter converter = new Converter();
         int result = converter.euroToRuble(1);
         assertThat(result, is(70));
    }

    /**
     * Test dollarToRuble
     */
    @Test
    public void when1DollarToRubleThen60() {
         Converter converter = new Converter();
         int result = converter.dollarToRuble(1);
         assertThat(result, is(60));
    }
}
