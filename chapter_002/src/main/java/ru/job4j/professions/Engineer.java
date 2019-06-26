package ru.job4j.professions;

/**
 * Class Engineer
 * Подклас(наследник) класса Profession
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 *
 * Поля класса Engineer будут уникальными для всех объектов класса и общими для всех объектов его подклассов(наследников)
 * Поле nameProf определяем как final(финальное)
 * Теперь переменная nameProf будет иметь значение "Инженер" для всех объектов класса и для всех объектов
 * его подклассов(наследников)
 */
public class Engineer extends Profession {
    public String techSpecification;
    public int numTechSpecification;
    final String nameProf = "Инженер";

    /**
     * Определяем явно конструктор по умолчанию
     * С помощью ключевого слова super вызываем конструктор суперкласса
     */
    public Engineer() {
        super();
    }

    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Engineer.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     */
    public Engineer(String surname) {
        super(surname);
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Engineer.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     * @param numTechSpecification количество техзаданий
     */
    public Engineer(String surname, String birthday, String education, int numTechSpecification) {
        super(surname, birthday, education);
        this.numTechSpecification = numTechSpecification;
    }

    /**
     * Метод getNameProf
     * @return nameProf название профессии
     */
    public String getNameProf() {
        return  this.nameProf;
    }

    /**
     * Метод getNumTechSpecification
     * @return numTechSpecification количество пациентов
     */
    public int getNumTechSpecification() {
        return this.numTechSpecification;
    }

    /**
     * Метод getTechSpecification инициализирует переменную techSpecification класса Engineer
     * переменной объекта класса TechSpecification
     * @param techSpecification объект класса TechSpecification
     * @return techSpecification
     */
    public String getTechSpecification(TechSpecification techSpecification) {
        this.techSpecification = techSpecification.getNameSpecification();
        return this.techSpecification;
    }

    /**
     * Переопределяем метод info суперкласса для класса Engineer
     * Добавлены название профессии и количество техзаданий
     */
    public void info() {
        System.out.println(
                String.format("Фамилия %s\nПрофессия %s\nГод рождения %s\nОбразование %s\nКоличество\nтехзаданий %s",
                        getSurname(), getNameProf(), getBirthday(), getEducation(), getNumTechSpecification()));
    }

    /**
     * Метод infoTechSpecification выводит на консоль фамилию инженера и название техзадания
     * @param engineer объект класса Engineer
     * @param techSpecification объект класса TechSpecification
     *
     */
    public void infoTechSpecification(Engineer engineer, TechSpecification techSpecification) {
        System.out.println(
                String.format("Фамилия инженера %s\nТехническое задание\n%s",
                        engineer.getSurname(), getTechSpecification(techSpecification)));
    }
}
