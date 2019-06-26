package ru.job4j.professions;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class DoctorTest
 * Класс тестов методов класса Doctor
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class DoctorTest {

    /**
     * тест метода info
     */
    @Test
    public void testInfo() {
        Doctor doctor = new Doctor("Иванов", "1995", "ХМИ", 2876);
        doctor.info();
    }

    /**
     * тест метода getNameProf
     */
    @Test
    public void testGetNameProf() {
        Doctor doctor = new Doctor();
        String expected = "Врач";
        String actual = doctor.getNameProf();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void testGetSurname() {
        Doctor doctor = new Doctor("Иванов", "1995", "ХМИ", 2876);
        String expected = doctor.surname;
        String actual = doctor.getSurname();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода  getBirthday
     */
    @Test
    public void testGetBirthday() {
        Doctor doctor = new Doctor("Иванов", "1995", "ХМИ", 2876);
        String expected = doctor.birthday;
        String actual = doctor.getBirthday();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void testGetEducation() {
        Doctor doctor = new Doctor("Иванов", "1995", "ХМИ", 2876);
        String expected = doctor.education;
        String actual = doctor.getEducation();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getQuantityPatient
     */
    @Test
    public void testGetQuantityPatient() {
        Doctor doctor = new Doctor("Иванов", "1995", "ХМИ", 2876);
        int result = doctor.getQuantityPatient();
        assertThat(result, is(2876));
    }

    /**
     * тест метода diagnose
     */
    @Test
    public void testDiagnose() {
        Doctor doctor = new Doctor();
        Patient patient = new Patient("Петров", null);
        Diagnosis diagnosis = new Diagnosis("Аппендицит");
        String expected = diagnosis.nameDiagnosis;
        String actual = doctor.diagnose(patient, diagnosis);
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода infoPatient
     */
    @Test
    public void testPatientInfo() {
        Doctor doctor = new Doctor("Иванов", "1995", "ХМИ", 2876);
        Patient patient = new Patient("Петров");
        Diagnosis diagnosis = new Diagnosis("Аппендицит");
        doctor.infoPatient(doctor, patient, diagnosis);
    }
}