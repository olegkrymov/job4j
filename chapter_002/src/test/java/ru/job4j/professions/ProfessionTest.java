package ru.job4j.professions;


import org.junit.Assert;
import org.junit.Test;

/**
 * Class ProfessionTest
 * Класс тестов методов класса Profession
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class ProfessionTest {
    /**
     * тест метода info
     */
    @Test
    public void testInfo() {
        Profession profession = new Profession("Иванов", "1995", "ММИ");
        profession.info();
    }

    /**
     * тест метода getSurname
     */
    @Test
    public void testGetSurname() {
        Profession profession = new Profession("Иванов", "1995", "ММИ");
        String expected = profession.surname;
        String actual = profession.getSurname();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getBirthday
     */
    @Test
    public void testGetBirthday() {
        Profession profession = new Profession("Иванов", "1995", "ММИ");
        String expected = profession.birthday;
        String actual = profession.getBirthday();
        Assert.assertEquals(expected, actual);
    }

    /**
     * тест метода getEducation
     */
    @Test
    public void testGetEducation() {
        Profession profession = new Profession("Иванов", "1995", "ММИ");
        String expected = profession.education;
        String actual = profession.getEducation();
        Assert.assertEquals(expected, actual);
    }
}