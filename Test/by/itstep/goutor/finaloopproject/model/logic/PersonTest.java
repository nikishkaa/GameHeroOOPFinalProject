package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.charecter.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    public static Person person1;
    public static Person person2;
    public static Person[] persons;

    @Before
    public void initArrayPersons() {
        person1 = new Person();

        person2 = new Person();

        persons = new Person[]{person1, person2};
    }

    @After
    public void clearing() {
        person1 = null;
        person2 = null;
        persons = null;
    }

    @Test
    public void testAllLevel() {
        person1.setLevel(50);
        person2.setLevel(100);

        int expected = 150;

        int actual = PersonManager.getAllPersonLevel(persons);

        assertEquals(expected, actual);
    }

    @Test
    public void testNullPerson() {
        persons = null;

        int expected = -1;

        int actual = PersonManager.getAllPersonLevel(persons);

        assertEquals(expected, actual);
    }


    @Test
    public void testNullLengthArray() {
        Person[] nullLengthPerson = new Person[0];

        int expected = -1;

        int actual = PersonManager.getAllPersonLevel(nullLengthPerson);

        assertEquals(expected, actual);
    }

}
