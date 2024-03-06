package by.itstep.goutor.finaloopproject.model.logic;
import by.itstep.goutor.finaloopproject.model.charecter.Person;
import org.junit.Test;
import org.junit.Assert;

public class PersonTest {
    @Test
    public  void allLevelTest() {

        int levelOne = 20;
        int levelTwo = 30;

        int expected = 50;


        Person[] persons = {};
        int actual = PersonManager.getAllPersonLevel(persons);

    }
}
