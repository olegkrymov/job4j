package ru.job4j.loop;

import java.util.function.BiPredicate;
/**
 * Построение пирамиды в псевдографике.
 * Class Paint.
 * @author Oleg Krymov
 * @since 17.05.2019
 * version 2
 */
public class Paint {

    /**
     * Метод rightTrl реализует правосторонний треугольник.
     * @param height высота треугольника.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует правосторонний равнобедренный треугольник заданной высоты.
     */
        public String rightTrl(int height) {
            return this.loopBy(
                    height,
                    height,
                    (row, column) -> row >= column
            );
    }

    /**
     * Метод leftTrl реализует левосторонний треугольник.
     * @param height высота треугольника.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует левосторонний равнобедренный треугольник заданной высоты.
     */
    public String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Метод pyramid реализует пирамиду.
     * @param height высота пирамиды.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует пирамиду заданной высоты.
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    /**
     * Универсальный метод loopBy
     * @param height высота пирамиды.
     * @param widht высота пирамиды.
     * BiPredicate условие проставление галки.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует пирамиду заданной высоты и ширины с определенным условием проставления галки.
     */
    private String loopBy(int height, int widht, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != widht; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
