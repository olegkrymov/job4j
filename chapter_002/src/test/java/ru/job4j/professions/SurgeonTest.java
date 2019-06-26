package ru.job4j.professions;


import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class SurgeonTest
 * Класс тестов методов класса Surgeon
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class SurgeonTest {

    /**
     * тест метода info
     */
    @Test
    public void testInfo() {
        Surgeon surgeon = new Surgeon("Иванов", "1995", "ХМИ", 2876, 3000);
        surgeon.info();
    }

    /**
     * тест метода diagnose
     */
    @Test
    public void testDiagnose() {
        Surgeon surgeon = new Surgeon();
        Patient patient = new Patient("Петров", null);
        Diagnosis diagnosis = new Diagnosis("Аппендицит");
        String expected = diagnosis.nameDiagnosis;
        String actual = surgeon.diagnose(patient, diagnosis);
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода infoPatient
     */
    @Test
    public void testPatientInfo() {
        Surgeon surgeon = new Surgeon("Иванов");
        Patient patient = new Patient("Петров");
        Diagnosis diagnosis = new Diagnosis("Кариес");
        surgeon.infoPatient(surgeon, patient, diagnosis);
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void testGetSurname() {
        Surgeon surgeon = new Surgeon("Иванов");
        String expected = surgeon.surname;
        String actual = surgeon.getSurname();
        Assert.assertEquals(expected, actual);
        System.out.println(surgeon.getSurname());
    }

    /**
     * тест метода getBirthday
     */
    @Test
    public void testGetBirthday() {
        Surgeon surgeon = new Surgeon("Иванов", "1995", "ХМИ", 2876, 3000);
        String expected = surgeon.birthday;
        String actual = surgeon.getBirthday();
        Assert.assertEquals(expected, actual);
        System.out.println(surgeon.getBirthday());
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void testGetEducation() {
        Surgeon surgeon = new Surgeon("Иванов", "1995", "ХМИ", 2876, 3000);
        String expected = surgeon.education;
        String actual = surgeon.getEducation();
        Assert.assertEquals(expected, actual);
        System.out.println(surgeon.getEducation());
    }

    /**
     * тест метода getQuantityPatient
     */
    @Test
    public void testGetQuantityPatient() {
        Surgeon surgeon = new Surgeon("Иванов", "1995", "ХМИ", 2876, 3000);
        int result = surgeon.getQuantityPatient();
        assertThat(result, is(2876));
    }

    /**
     * тест метода getNumSurgeOperation
     */
    @Test
    public void testNumSurgeOperation() {
        Surgeon surgeon = new Surgeon("Иванов", "1995", "ХМИ", 2876, 3000);
        int result = surgeon.getNumSurgeOperation();
        assertThat(result, is(3000));
    }
}