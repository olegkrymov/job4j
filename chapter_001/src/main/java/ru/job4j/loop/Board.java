package ru.job4j.loop;

/**
 * Построение шахматной доски в псевдографике.
 * Class Board.
 * @author Oleg Krymov
 * @since 17.05.2019
 * version 1
 */
public class Board {
    /**
     * Метод paint рисует шахматную доску из символов x и пробелов.
     * @param width  ширина доски.
     * @param height высота доски.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует доску с заданными параметрами.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int hor = 0; hor < height; hor++) {
            for (int ver = 0; ver < width; ver++) {
                if ((hor + ver) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
