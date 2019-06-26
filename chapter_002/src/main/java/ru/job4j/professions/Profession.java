package ru.job4j.professions;

/**
 * Class Profession
 * Суперкласс для подклассов Engineer и Doctor
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * version 1
 *
 * Поля класса Profession будут общими для всех его подклассов(наследников)
 */
public class Profession {
    public String nameProf, speciality, surname, education, birthday;

    /**
     * Определяем явно конструктор по умолчанию
     */
    public Profession() {

    }
    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Profession.
     * @param surname фамилия работника
     */
    public Profession(String surname) {
        this.surname = surname;
    }
    /**
     * Определяем конструктор инициализирующий поля объектов класса Profession.
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     */
    public Profession(String surname, String birthday, String education) {
        this.surname = surname;
        this.birthday = birthday;
        this.education = education;
    }

    /**
     * Метод getSurname
     * @return surname
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * Метод getEducation
     * @return education
     */
    public String getEducation() {
        return this.education;
    }

    /**
     * Метод getBirthday
     * @return birthday
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * Метод info выводит в консоль основные данные о работнике
     * Фамилию, год рождения, образование
     */
    public void info() {
        System.out.println(String.format("Данные работника\nФамилия %s\nГод рождения %s\nОбразование %s\n",
                getSurname(), getBirthday(), getEducation()));
    }
}
