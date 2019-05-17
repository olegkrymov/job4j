package ru.job4j.loop;

/**
 * Построение пирамиды в псевдографике.
 * Class Paint.
 * @author Oleg Krymov
 * @since 17.05.2019
 * version 1
 */
public class Paint {

    /**
     * Метод rightTrl реализует правосторонний треугольник.
     * @param height высота треугольника.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует правосторонний равнобедренный треугольник заданной высоты.
     */
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // т.к. треугольник равнобедренный, то ширина будет равна высоте width = height.
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != height; column++) {
                // если строка равна ячейке, то рисуем галку.
                // в данном случае строка определяет, сколько галок будет в строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    /**
     * Метод leftTrl реализует левосторонний треугольник.
     * @param height высота треугольника.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует левосторонний равнобедренный треугольник заданной высоты.
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != height; column++) {
                // т.к. в этом случае мы должны выставлять галки с конца, то для этого берем ширину всей строки
                // вычитаем текущий указатель на ячейку и отнимаем 1 потому, что элементы в
                // массиве начинаются с 0, а не с 1.
                if (row >= height - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * Метод pyramid реализует пирамиду.
     * @param height высота пирамиды.
     * @return метод toString для StringBuilder возвращает все добавленные в него символы и строки,
     * в нашем случае рисует пирамиду заданной высоты.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                // объеденяем два условия вместе через оператор &&.
                if (row >= height - column - 1 && row + height - 1 >= column) {
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
