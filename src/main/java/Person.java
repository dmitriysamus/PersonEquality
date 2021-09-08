import java.util.Objects;

/**
 * Реализует интерфейс Comparable<Person>.
 * Определяет следующий порядок по возрастанию:
 * - сначала по полю city,
 * - затем по полю name.
 * Поля name, city отличны от null.
 */
public class Person {
    private String name;
    private String city;
    private int age;

    /**
     * Конструктор объекта типа Person.
     */
    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    /**
     * Производит расчет hashCode объекта по полям name, city и age.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.city.toLowerCase(), this.name.toLowerCase(), this.age);
    }

    /**
     * Проверяет идентичность объектов по полям name, city и age.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        Person other = (Person) obj;

        return this.city.equalsIgnoreCase(other.city) &&
                this.name.equalsIgnoreCase(other.name) &&
                this.age == other.age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
