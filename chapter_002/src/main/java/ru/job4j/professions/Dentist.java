package ru.job4j.professions;

/**
 * Class Dentist
 * Подклас(наследник) класса Doctor
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 *
 * Поля класса Dentist будут уникальными для всех объектов класса и общими для всех объектов его подклассов(наследников)
 * Поле speciality определяем как final(финальное)
 * Теперь переменная speciality будет иметь значение "Стамотолог" для всех объектов класса и для всех объектов
 * его подклассов(наследников)
 */
public class Dentist extends Doctor {
    public int numDentalOperation;
    final String speciality = "Стамотолог";

    /**
     * Определяем явно конструктор по умолчанию
     * С помощью ключевого слова super вызываем конструктор суперкласса
     */
    public Dentist() {
        super();
    }

    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Surgeon.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     */
    public Dentist(String surname) {
        super(surname);
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Surgeon.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     * @param quantityPatient количество пациентов
     * @param numDentalOperation количество проведенных стамотологических операций
     */
    public Dentist(String surname, String birthday, String education, int quantityPatient, int numDentalOperation) {
        super(surname, birthday, education, quantityPatient);
        this.numDentalOperation = numDentalOperation;
    }

    /**
     * Метод operateTooth
     * @param patient объект класса Patient
     */
    public void operateTooth(Patient patient) {

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
     * @return numDentalOperation количество стамотологических операций
     */
    public int getNumDentalOperation() {
        return numDentalOperation;
    }

    /**
     * Переопределяем метод info суперкласса для класса Dentist
     * Добавлены название специальности врача и количество проведенных стамотологических операций
     */
    public void info() {
        System.out.println(
                        String.format("Профессия %s\nСпециальност %s\nФамилия %s\nГод рождения %s\nОбразование %s\n"
                                        + "Количество\nпациентов %s\nКоличество\nстамотологических операций %s\n",
                        getNameProf(), getSpeciality(), getSurname(), getBirthday(), getEducation(),
                        getQuantityPatient(), getNumDentalOperation()));
    }
}
