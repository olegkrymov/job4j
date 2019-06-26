package ru.job4j.professions;

/**
 * Class Programmer
 * Подклас(наследник) класса Engineer
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 *
 * Поля класса Programmer будут уникальными для всех объектов класса и общими для всех объектов его подклассов(наследников)
 * Поле speciality определяем как final(финальное)
 * Теперь переменная speciality будет иметь значение "Программист" для всех объектов класса и для всех объектов
 * его подклассов(наследников)
 */
public class Programmer extends Engineer {
    public int numProject;
    final String speciality = "Программист";

    /**
     * Определяем явно конструктор по умолчанию
     * С помощью ключевого слова super вызываем конструктор суперкласса
     */
    public Programmer() {
        super();
    }

    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Programmer.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     */
    public Programmer(String surname) {
        super(surname);
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Programmer.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     * @param numTechSpecification количество техзаданий
     * @param numProject количество проектов
     */
    public Programmer(String surname, String birthday, String education, int numTechSpecification, int numProject) {
        super(surname, birthday, education, numTechSpecification);
        this.numProject = numProject;
    }

    /**
     * Метод getSpeciality
     * @return speciality специальность инженера
     */
    public String getSpeciality() {
        return  this.speciality;
    }

    /**
     * Метод getNumProject
     * @return numProject количество проектов
     */
    public int getNumProject() {
        return this.numProject;
    }

    /**
     * Метод programme
     * @param techSpecification объект класса TechSpecification
     */
    public void programme(TechSpecification techSpecification) {

    }

    /**
     * Переопределяем метод info суперкласса для класса Programmer
     * Добавлены специальность инженера и количество проектов
     */
    public void info() {
        System.out.println(
                String.format("Фамилия %s\nПрофессия %s\nСпециальност %s\nГод рождения %s\nОбразование %s\nКоличество\nтехзаданий %s\n"
                                + "Количество проектов\n%s",
                        getSurname(), getNameProf(), getSpeciality(), getBirthday(), getEducation(),
                        getNumTechSpecification(), getNumProject()));
    }
}
