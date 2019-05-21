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
     * @param data  boolean массив.
     * @return true, если массив заполнен по диагоналям, либо значениями true, либо false.
     * false, если элементы массива имеют значения и true и false.
     * Если диагонали не содержат общих ячеек, тогда диагонали могут быть разными по значению.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
          for (int i = 0; i != data.length; i++) {
              //проверяем на равенство значения диагонали слева направо
              if (data[0][0] != data[i][i]) {
                result = false;
                break;
              }
              //проверяем на равенство значения диагонали справа налево
              if (data[data.length - 1][0] != data[i][data.length - i - 1]) {
                  result = false;
                  break;
              }
          }
        return result;
    }
}
