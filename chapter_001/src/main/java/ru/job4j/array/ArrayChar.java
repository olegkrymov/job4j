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
     * @param word слово.
     * @param prefix префикс.
     * @return true если слово начинаеться с префикса,
     * иначе false.
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        // метод toCharArray преобразовывает все символы в объекте класса String
        // в символьный массив.
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        // оператора for переберает значения соответствующих элементов символьных массивов wrd и pref
        // и сравнивает их между собой.
        for (int i = 0; i != pref.length; i++) {
            if (wrd[i] != pref[i]) {
                result = false;
                break;
            }
        }
            return result;
    }
}
