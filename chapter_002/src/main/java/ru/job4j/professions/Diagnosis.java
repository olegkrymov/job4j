package ru.job4j.professions;

/**
 * Class Diagnosis
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class Diagnosis {
    public String nameDiagnosis;

    /**
     * Определяем конструктор инициализирующий поле nameDiagnosis объектов класса Diagnosis.
     * @param nameDiagnosis название диагноза
     */
    public Diagnosis(String nameDiagnosis) {
        this.nameDiagnosis = nameDiagnosis;
    }

    /**
     * Метод getDiagnosis
     * @param patient объект класса Patient
     * @return nameDiagnosis название диагноза
     */
    public String getDiagnosis(Patient patient) {
        return nameDiagnosis;
    }
}
