package ru.job4j.array;

/**
 * Проверка, что все элементы по диагоналям в квадратном массиве являются true или false.
 * Class MatrixCheck
 * @author Oleg Krymov
 * @since 21.05.2019
 * version 1
 */
public class MatrixCheck {

    /**
     * Метод mono который принимает в себя квадратный boolean массив.
     * Сначала мы проверяем на равенство значения диагонали слева направо,
     * затем справа налево.
     * @param data  boolean массив.
     * @return true, если массив заполнен по диагоналям, либо значениями true, либо false.
     * false, если элементы массива имеют значения и true и false.
     * Если диагонали не содержат общих ячеек, тогда диагонали могут быть разными по значению.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
          for (int index = 0; index != data.length; index++) {
              if (data[0][0] != data[index][index]) {
                result = false;
                break;
              }
              if (data[data.length - 1][0] != data[index][data.length - index - 1]) {
                  result = false;
                  break;
              }
          }
        return result;
    }
}
