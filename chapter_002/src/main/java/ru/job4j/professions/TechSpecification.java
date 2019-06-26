package ru.job4j.professions;

/**
 * Class TechSpecification
 * @author Oleg Krymov(krymov.o@gmail.com)
 * @since 26.06.2019
 * @version 1
 */
public class TechSpecification {
    public String name;

    /**
     * Определяем явно конструктор по умолчанию
     */
    public TechSpecification() {

    }
    /**
     * Определяем конструктор инициализирующий поле name объектов класса TechSpecification.
     * @param name название техзадания
     */
    public TechSpecification(String name) {
        this.name = name;
    }

    /**
     * Метод getNameSpecification
     * @return name
     */
    public String getNameSpecification() {
        return this.name;
    }
}
