package ru.job4j.condition;

/**
 * Вычисление площади прямоугольника если известно, что ширина больше высоты в к раз,
 * а также известен периметр прямоугольника р.
 * Class SqArea
 * @author Oleg Krymov
 * @since 09.05.2019
 * version 1
 */
public class SqArea {

    /**
     * метод height вычисляющий площадь прямоугольника.
     * @param p периметр прямоугольника.
     * @param k соотношения длин ширины и высоты.
     * @return площадь прямоугольника.
     */
    public int square(int p, int k) {
        int height = p / (2 * k + 2);
        return height * height * k;
    }
}
