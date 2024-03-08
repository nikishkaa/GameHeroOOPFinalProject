package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.charecter.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.charecter.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class PersonTest {
    public static Person person1;
    public static Person person2;
    public static Person[] persons;

    @Before
    public void initArrayPersons() {
        person1 = new Person();
        person1.setLevel(50);

        person2 = new Person();
        person2.setLevel(100);

        persons = new Person[]{person1, person2};
    }

    @Test
    public void testAllLevel() {


        int expected = 150;

        int actual = PersonManager.getAllPersonLevel(persons);

        if (actual != expected) {
            Assert.fail();
        }

    }
}
