package ru.job4j.professions;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Class EngineerTest
 * Класс тестов методов класса Engineer
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class EngineerTest {

    /**
     * тест метода getNameProf
     */
    @Test
    public void getNameProf() {
        Engineer engineer = new Engineer();
        String expected = "Инженер";
        String actual = engineer.getNameProf();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void getSurname() {
        Engineer engineer = new Engineer("Иванов");
        String expected = "Иванов";
        String actual = engineer.getSurname();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void getEducation() {
        Engineer engineer = new Engineer("Иванов", "1995", "МВТУ", 125);
        String expected = "МВТУ";
        String actual = engineer.getEducation();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getBirthday
     */
    @Test
    public void getBirthday() {
        Engineer engineer = new Engineer("Иванов", "1995", "МВТУ", 125);
        String expected = "1995";
        String actual = engineer.getBirthday();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода info
     */
    @Test
    public void info() {
        Engineer engineer = new Engineer("Иванов", "1995", "МВТУ", 125);
        engineer.info();
    }

    /**
     * тест метода getNumTechSpecification
     */
    @Test
    public void getNumTechSpecification() {
        Engineer engineer = new Engineer("Иванов", "1995", "МВТУ", 125);
        int result = engineer.getNumTechSpecification();
        assertThat(result, is(125));
    }

    /**
     * тест метода getTechSpecification
     */
    @Test
    public void getTechSpecification() {
        Engineer engineer = new Engineer();
        TechSpecification techSpecification = new TechSpecification("Чертеж");
        String expected = "Чертеж";
        String actual = engineer.getTechSpecification(techSpecification);
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода infoTechSpecification
     */
    @Test
    public void infoTechSpecification() {
        Engineer engineer = new Engineer("Иванов");
        TechSpecification techSpecification = new TechSpecification("Чертеж");
        engineer.infoTechSpecification(engineer, techSpecification);
    }
}