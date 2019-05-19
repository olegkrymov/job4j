package ru.job4j.array;

/**
 * Нахождение индекс элемента массива, удовлетворяющего условию..
 * Class FindLoop
 * @author Oleg Krymov
 * @since 19.05.2019
 * version 1
 */
public class FindLoop {

    /**
     * Метод indexOf последовательно переберает каждый элемент массива.
     * Если элемент подходит под условие, мы останавливаем цикл и возвращаем индекс нашего элемента.
     * @param data массив.
     * @param el параметр искомого элемента.
     * @return rst индекс найденного элемента.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
