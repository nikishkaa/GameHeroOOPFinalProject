package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.charecter.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.charecter.Person;
import org.junit.Test;
import org.junit.Assert;

public class PersonTest {
    @Test
    public void testAllLevel() {

        MagicianAstrologer magicianAstrologer1 =
                new MagicianAstrologer("1", true, 100, 50, 20);

        MagicianAstrologer magicianAstrologer2 =
                new MagicianAstrologer("2", true, 100, 40, 10);

        Person[] persons = new Person[]{magicianAstrologer1, magicianAstrologer2};


        int expected = 90;

        int actual = PersonManager.getAllPersonLevel(persons);

        if (actual != expected) {
            Assert.fail();
        }

    }
}
