package by.itstep.goutor.finaloopproject.model.logic;
/*

        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
*/

import by.itstep.goutor.finaloopproject.model.charecter.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*

        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
        !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
*/
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

    /*

            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
            !!!!!!!!!!!!!! NEW VERSION https://github.com/nikishkaa/GameHerooOOPFinalProjectVersion2.git  !!!!!!!!!!!!
    */
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
    public void testNullPersonInAllLevel() {
        persons = null;

        int expected = -1;

        int actual = PersonManager.getAllPersonLevel(persons);

        assertEquals(expected, actual);
    }


    @Test
    public void testNullLengthArrayPersonInAllLevel() {
        Person[] nullLengthPerson = new Person[0];

        int expected = -1;

        int actual = PersonManager.getAllPersonLevel(nullLengthPerson);

        assertEquals(expected, actual);
    }

    @Test
    public void testNullMagicianAstrologerInAllLevel() {
        Person[] nullMagicianAstrologer = new Person[]{null};

        int expected = -1;

        int actual = PersonManager.getAllPersonLevel(nullMagicianAstrologer);

        assertEquals(expected, actual);
    }


}
