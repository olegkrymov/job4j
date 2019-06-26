package ru.job4j.professions;

/**
 * Class Surgeon
 * Подклас(наследник) класса Doctor
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 *
 * Поля класса Surgeon будут уникальными для всех объектов класса и общими для всех объектов его подклассов(наследников)
 * Поле speciality определяем как final(финальное)
 * Теперь переменная speciality будет иметь значение "Хирург" для всех объектов класса и для всех объектов
 * его подклассов(наследников)
 */
public class Surgeon extends Doctor {
    public int numSurgeOperation;
    final String speciality = "Хирург";

    /**
     * Определяем явно конструктор по умолчанию
     * С помощью ключевого слова super вызываем конструктор суперкласса
     */
    public Surgeon() {
        super();
    }

    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Surgeon.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     */
    public Surgeon(String surname) {
        super(surname);
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Surgeon.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     * @param quantityPatient количество пациентов
     * @param numSurgeOperation количество проведенных хирургических операций
     */
    public Surgeon(String surname, String birthday, String education, int quantityPatient, int numSurgeOperation) {
        super(surname, birthday, education, quantityPatient);
        this.numSurgeOperation = numSurgeOperation;
    }

    /**
     * Метод surgery
     * @param patient объект класса Patient
     */
    public void surgery(Patient patient) {

    }

    /**
     * Метод getSpeciality
     * @return speciality специальность врача
     */
    public String getSpeciality() {
        return  this.speciality;
    }

    /**
     * Метод getNumSurgeOperation
     * @return numSurgeOperation количество хирургических операций
     */
    public int getNumSurgeOperation() {
        return numSurgeOperation;
    }

    /**
     * Переопределяем метод info суперкласса для класса Surgeon
     * Добавлены название специальности врача и количество проведенных хирургических операций
     */
    public void info() {
        System.out.println(
                String.format("Профессия %s\nСпециальност %s\nФамилия %s\nГод рождения %s\nОбразование %s\n"
                                + "Количество\nпациентов %s\nКоличество\nхирургических операций %s\n",
                        getNameProf(), getSpeciality(), getSurname(), getBirthday(), getEducation(),
                        getQuantityPatient(), getNumSurgeOperation()));
    }
}
