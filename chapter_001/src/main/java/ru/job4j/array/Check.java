package ru.job4j.array;

/**
 * Проверка, что все элементы в массиве являются true или false.
 * Class Check
 * @author Oleg Krymov
 * @since 20.05.2019
 * version 1
 */
public class Check {

    /**
     * Метод mono который принимает в себя boolean массив.
     * @param data  boolean массив.
     * @return true, если массив заполнен полностью, либо значениями true, либо false.
     * false, если элементы массива имеют значения и true и false.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] != data[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
