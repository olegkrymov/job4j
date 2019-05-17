package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тесты метода paint класса Board.
 * Class BoardTest.
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @version 1
 * @since 17.05.2019
 */

public class BoardTest {

    /**
     * Test метода paint проверяющий формирование доски 3 на 3.
     */
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
    Board board = new Board();
    String result = board.paint(3, 3);
    final String line = System.getProperty("line.separator");
    String expected = String.format("x x%s x %sx x%s", line, line, line);
    assertThat(result, is(expected));
}

    /**
     * Test метода paint проверяющий формирование доски 5 на 4.
     */
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}
