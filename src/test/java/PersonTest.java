import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
    List<Person> arrayList;

    /**
     * Подготовка данных для тестов.
     */
    @BeforeEach
    void Init() {
        arrayList = new ArrayList<>();
        arrayList.add(new Person("Andrey", "Yalta", 29));
        arrayList.add(new Person("oleg", "NOVOSIBIRSK", 20));
        arrayList.add(new Person("OleG", "Novosibirsk", 20));
    }

    /**
     * Очистка объектов после тестов.
     */
    @AfterEach
    void clean() {
        arrayList = null;
    }

    /**
     * Проверяется работа метода hashCode().
     * Ожидается, что на hashCode влияет только значение name, city и age.
     */
    @Test
    void hashCode_Test() {
        Assert.assertEquals(arrayList.get(1).hashCode(), arrayList.get(2).hashCode());
        Assert.assertNotEquals(arrayList.get(1).hashCode(), arrayList.get(0).hashCode());
        Assert.assertNotEquals(arrayList.get(2).hashCode(), arrayList.get(0).hashCode());
    }

    /**
     * Проверяется работа метода equals().
     * Ожидается, что сравнивается только значение name, city и age.
     */
    @Test
    void equals_Test() {
        Assert.assertEquals(arrayList.get(1), arrayList.get(2));
        Assert.assertNotEquals(arrayList.get(1), arrayList.get(0));
        Assert.assertNotEquals(arrayList.get(2), arrayList.get(0));
    }
}
