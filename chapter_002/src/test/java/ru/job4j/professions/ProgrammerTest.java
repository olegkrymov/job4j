package ru.job4j.professions;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class ProgrammerTest
 * Класс тестов методов класса Programmer
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class ProgrammerTest {

    /**
     * тест метода getNameProf
     */
    @Test
    public void getNameProf() {
        Programmer programmer = new Programmer();
        String expected = "Инженер";
        String actual = programmer.getNameProf();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getSpeciality
     */
    @Test
    public void getSpeciality() {
        Programmer programmer = new Programmer();
        String expected = "Программист";
        String actual = programmer.getSpeciality();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void getSurname() {
        Programmer programmer = new Programmer("Иванов");
        String expected = "Иванов";
        String actual = programmer.getSurname();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getBirthday
     */
    @Test
    public void getBirthday() {
        Programmer programmer = new Programmer("Иванов", "1995", "МВТУ", 276, 276);
        String expected = "1995";
        String actual = programmer.getBirthday();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void getEducation() {
        Programmer programmer = new Programmer("Иванов", "1995", "МВТУ", 276, 276);
        String expected = "МВТУ";
        String actual = programmer.getEducation();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getNumTechSpecification
     */
    @Test
    public void getNumTechSpecification() {
        Programmer programmer = new Programmer("Иванов", "1995", "МВТУ", 276, 276);
        int result = programmer.getNumTechSpecification();
        assertThat(result, is(276));
    }

    /**
     * тест метода getNumProject
     */
    @Test
    public void getNumProject() {
        Programmer programmer = new Programmer("Иванов", "1995", "МВТУ", 276, 276);
        int result = programmer.getNumProject();
        assertThat(result, is(276));
    }

    /**
     * тест метода info
     */
    @Test
    public void info() {
        Programmer programmer = new Programmer("Иванов", "1995", "МВТУ", 276, 276);
        programmer.info();

    }

    /**
     * тест метода getTechSpecification
     */
    @Test
    public void getTechSpecification() {
        Programmer programmer = new Programmer();
        TechSpecification techSpecification = new TechSpecification("Программа");
        String expected = "Программа";
        String actual = programmer.getTechSpecification(techSpecification);
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода infoTechSpecification
     */
    @Test
    public void infoTechSpecification() {
        Programmer programmer = new Programmer("Иванов");
        TechSpecification techSpecification = new TechSpecification("Программа");
        programmer.infoTechSpecification(programmer, techSpecification);
    }
}