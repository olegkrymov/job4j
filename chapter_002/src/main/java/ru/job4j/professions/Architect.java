package ru.job4j.professions;

/**
 * Class Architect
 * Подклас(наследник) класса Engineer
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 *
 * Поля класса Architect будут уникальными для всех объектов класса и общими для всех объектов его подклассов(наследников)
 * Поле speciality определяем как final(финальное)
 * Теперь переменная speciality будет иметь значение "Архитектор" для всех объектов класса и для всех объектов
 * его подклассов(наследников)
 */
public class Architect extends Engineer {
    public int numArchitectDrawing;
    final String speciality = "Архитектор";

    /**
     * Определяем явно конструктор по умолчанию
     * С помощью ключевого слова super вызываем конструктор суперкласса
     */
    public Architect() {
        super();
    }

    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Architect.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     */
    public Architect(String surname) {

        super(surname);
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Programmer.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     * @param numTechSpecification количество техзаданий
     * @param numArchitectDrawing количество созданных чертежей
     */
    public Architect(String surname, String birthday, String education, int numTechSpecification, int numArchitectDrawing) {
        super(surname, birthday, education, numTechSpecification);
        this.numArchitectDrawing = numArchitectDrawing;
    }

    /**
     * Метод getSpeciality
     * @return speciality специальность инженера
     */
    public String getSpeciality() {
        return  this.speciality;
    }

    /**
     * Метод getNumArchitectDrawing
     * @return numArchitectDrawing количество созданных чертежей
     */
    public int getNumArchitectDrawing() {
        return this.numArchitectDrawing;
    }

    /**
     * Метод drawingArchitect
     * @param techSpecification объект класса TechSpecification
     */
    public void drawingArchitect(TechSpecification techSpecification) {

    }

    /**
     * Переопределяем метод info суперкласса для класса Architect
     * Добавлены специальность инженера и количество созданных чертежей
     */
    public void info() {
        System.out.println(
                String.format("Фамилия %s\nПрофессия %s\nСпециальност %s\nГод рождения %s\nОбразование %s\nКоличество\nтехзаданий %s\n"
                                + "Количество чертежей\n%s",
                        getSurname(), getNameProf(), getSpeciality(), getBirthday(), getEducation(),
                        getNumTechSpecification(), getNumArchitectDrawing()));
    }

}
