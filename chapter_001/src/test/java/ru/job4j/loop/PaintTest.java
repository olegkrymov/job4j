package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Тесты методов rightTrl, leftTrl и pyramid класса Paint.
 * Class PaintTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 17.05.2019
 */
public class PaintTest {
    /**
     * Test метода rightTrl проверяющий формирование правостороннего равнобедренного
     * треугольника высотой 4.
     */
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test метода leftTrl проверяющий формирование левостороннего равнобедренного
     * треугольника высотой 4.
     */
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test метода pyramid проверяющий формирование пирамиды высотой 4.
     */
    @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }

    /**
     * Test метода pyramid проверяющий формирование пирамиды высотой 5.
     */
    @Test
    public void whenPyramid5() {
        Paint paint = new Paint();
        String rst = paint.pyramid(5);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("    ^    ")
                                .add("   ^^^   ")
                                .add("  ^^^^^  ")
                                .add(" ^^^^^^^ ")
                                .add("^^^^^^^^^")
                                .toString()
                )
        );
    }
}
