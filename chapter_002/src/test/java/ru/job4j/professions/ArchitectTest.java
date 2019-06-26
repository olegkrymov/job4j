package ru.job4j.professions;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class ArchitectTest
 * Класс тестов методов класса Architect
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class ArchitectTest {

    /**
     * тест метода getTechSpecification
     */
    @Test
    public void getTechSpecification() {
        Architect architect = new Architect();
        TechSpecification techSpecification = new TechSpecification("Чертеж");
        String expected = "Чертеж";
        String actual = architect.getTechSpecification(techSpecification);
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода infoTechSpecification
     */
    @Test
    public void infoTechSpecification() {
        Architect architect = new Architect("Иванов");
        TechSpecification techSpecification = new TechSpecification("Чертеж");
        architect.infoTechSpecification(architect, techSpecification);
    }

    /**
     * тест метода getNameProf
     */
    @Test
    public void getNameProf() {
        Architect architect = new Architect();
        String expected = "Инженер";
        String actual = architect.getNameProf();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getSpeciality
     */
    @Test
    public void getSpeciality() {
        Architect architect = new Architect();
        String expected = "Архитектор";
        String actual = architect.getSpeciality();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void getSurname() {
        Architect architect = new Architect("Иванов");
        String expected = "Иванов";
        String actual = architect.getSurname();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void getEducation() {
        Architect architect = new Architect("Иванов", "1995", "МВТУ", 276, 276);
        String expected = "МВТУ";
        String actual = architect.getEducation();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getBirthday
     */
    @Test
    public void getBirthday() {
        Architect architect = new Architect("Иванов", "1995", "МВТУ", 276, 276);
        String expected = "1995";
        String actual = architect.getBirthday();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода info
     */
    @Test
    public void info() {
        Architect architect = new Architect("Иванов", "1995", "МВТУ", 276, 276);
        architect.info();
    }

    /**
     * тест метода getNumTechSpecification
     */
    @Test
    public void getNumArchitectDrawing() {
        Architect architect = new Architect("Иванов", "1995", "МВТУ", 276, 276);
        int result = architect.getNumTechSpecification();
        assertThat(result, is(276));
    }
}