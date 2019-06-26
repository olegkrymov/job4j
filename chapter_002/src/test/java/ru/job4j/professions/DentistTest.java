package ru.job4j.professions;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class DentistTest
 * Класс тестов методов класса Dentist
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class DentistTest {

    /**
     * тест метода info
     */
    @Test
    public void testInfo() {
        Dentist dentist = new Dentist("Иванов", "1995", "ХМИ", 2876, 3000);
        dentist.info();
    }

    /**
     * тест метода diagnose
     */
    @Test
    public void testDiagnose() {
        Dentist dentist = new Dentist();
        Patient patient = new Patient("Петров", null);
        Diagnosis diagnosis = new Diagnosis("Кариес");
        String expected = diagnosis.nameDiagnosis;
        String actual = dentist.diagnose(patient, diagnosis);
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода infoPatient
     */
    @Test
    public void testPatientInfo() {
        Dentist dentist = new Dentist("Иванов");
        Patient patient = new Patient("Петров");
        Diagnosis diagnosis = new Diagnosis("Кариес");
        dentist.infoPatient(dentist, patient, diagnosis);
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void testGetSurname() {
        Dentist dentist = new Dentist("Иванов");
        String expected = dentist.surname;
        String actual = dentist.getSurname();
        Assert.assertEquals(expected, actual);
        System.out.println(dentist.getSurname());
    }

    /**
     * тест метода getBirthday
     */
    @Test
    public void testGetBirthday() {
        Dentist dentist = new Dentist("Иванов", "1995", "ХМИ", 2876, 3000);
        String expected = dentist.birthday;
        String actual = dentist.getBirthday();
        Assert.assertEquals(expected, actual);
        System.out.println(dentist.getBirthday());
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void testGetEducation() {
        Dentist dentist = new Dentist("Иванов", "1995", "ХМИ", 2876, 3000);
        String expected = dentist.education;
        String actual = dentist.getEducation();
        Assert.assertEquals(expected, actual);
        System.out.println(dentist.getEducation());
    }

    /**
     * тест метода getQuantityPatient
     */
    @Test
    public void testGetQuantityPatient() {
        Dentist dentist = new Dentist("Иванов", "1995", "ХМИ", 2876, 3000);
        int result = dentist.getQuantityPatient();
        assertThat(result, is(2876));
    }

    /**
     * тест метода getNumDentalOperation
     */
    @Test
    public void testNumSurgeOperation() {
        Dentist dentist = new Dentist("Иванов", "1995", "ХМИ", 2876, 3000);
        int result = dentist.getNumDentalOperation();
        assertThat(result, is(3000));
    }
}