package ru.job4j.professions;

/**
 * Class Patient
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class Patient {
    public String surname;
    public String diagnosis;

    /**
     * Определяем конструктор инициализирующий поле объектов класса Patient.
     * @param surname фамилия пациента
     */
    public Patient(String surname) {
        this.surname = surname;
    }

    /**
     * Определяем конструктор инициализирующий поля объектов класса Patient.
     * @param surname фамилия пациента
     * @param diagnosis название диагноза
     */
    public Patient(String surname, String diagnosis) {
        this.surname = surname;
        this.diagnosis = diagnosis;
    }

    /**
     * Метод getSurname
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Метод getDiagnosis
     * @return diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
    }
}
