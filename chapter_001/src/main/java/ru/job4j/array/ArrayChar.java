package ru.job4j.array;

/**
 * Проверка, что слово начинается c определенной последовательности..
 * Class ArrayChar
 * @author Oleg Krymov
 * @since 20.05.2019
 * version 1
 */
public class ArrayChar {

    /**
     * Метод startsWith который принимает в себя два объкта класса String (проверяемое слово и искомый префикс) и
     * проверяет, что слово начинается с префикса.
     * Метод toCharArray преобразовывает все символы в объекте класса String в символьный массив.
     * Оператор for переберает значения соответствующих элементов символьных массивов wrd и pref
     * и сравнивает их между собой.
     * @param word слово.
     * @param prefix префикс.
     * @return true если слово начинаеться с префикса,
     * иначе false.
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int index = 0; index != pref.length; index++) {
            if (wrd[index] != pref[index]) {
                result = false;
                break;
            }
        }
            return result;
    }
}
