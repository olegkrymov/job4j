package ru.job4j.professions;

/**
 * Class Doctor
 * Подклас(наследник) класса Profession
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 *
 * Поля класса Doctor будут уникальными для всех объектов класса и общими для всех объектов его подклассов(наследников)
 * Поле nameProf определяем как final(финальное)
 * Теперь переменная nameProf будет иметь значение "Врач" для всех объектов класса и для всех объектов
 * его подклассов(наследников)
 */
public class Doctor extends Profession {
    public int quantityPatient;
    final String nameProf = "Врач";

    /**
     * Определяем явно конструктор по умолчанию
     * С помощью ключевого слова super вызываем конструктор суперкласса
     */
    public Doctor() {
        super();
    }

    /**
     * Определяем конструктор инициализирующий только поле surname объектов класса Doctor.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     */
    public Doctor(String surname) {
        super(surname);
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Doctor.
     * С помощью ключевого слова super вызываем конструктор суперкласса
     * @param surname фамилия работника
     * @param birthday год рождения
     * @param education образование
     * @param quantityPatient количество пациентов
     */
    public Doctor(String surname, String birthday, String education, int quantityPatient) {
        super(surname, birthday, education);
        this.quantityPatient = quantityPatient;
    }

    /**
     * Метод getNameProf
     * @return nameProf название профессии
     */
    public String getNameProf() {
        return  this.nameProf;
    }

    /**
     * Метод getQuantityPatient
     * @return quantityPatient количество пациентов
     */
    public int getQuantityPatient() {
        return this.quantityPatient;
    }

    /**
     * Метод diagnose
     * @param patient объект класса Patient
     * @param diagnosis объект класса Diagnosis
     * @return название диагноза
     */
    public String diagnose(Patient patient, Diagnosis diagnosis) {
       patient.diagnosis = diagnosis.nameDiagnosis;
        return diagnosis.getDiagnosis(patient);
    }

    /**
     * Переопределяем метод info суперкласса для класса Doctor
     * Добавлены название профессии и количество пациентов
     */
    public void info() {
        System.out.println(
                String.format("Фамилия %s\nПрофессия %s\nГод рождения %s\nОбразование %s\nКоличество\nпациентов %s",
                        getSurname(), getNameProf(), getBirthday(), getEducation(), getQuantityPatient()));
    }

    /**
     * Метод infoPatient выводит на консоль фамилию пациента, его диагноз и фамилию врача посавившего диагноз
     * @param doctor объект класса Doctor
     * @param patient объект класса Patient
     * @param diagnosis объект класса Diagnosis
     */
    public void infoPatient(Doctor doctor, Patient patient, Diagnosis diagnosis) {
        System.out.println(
                String.format("Фамилия пациента %s\nДиагноз %s\nФамилия врача %s",
                        patient.getSurname(), doctor.diagnose(patient, diagnosis), doctor.getSurname()));
    }
}
