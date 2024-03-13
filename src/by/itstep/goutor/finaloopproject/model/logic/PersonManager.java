package by.itstep.goutor.finaloopproject.model.logic;

import by.itstep.goutor.finaloopproject.model.charecter.Person;


public class PersonManager {
    public static Person[] getBiggestLevelPerson(Person[] persons) {

        if (persons == null || persons.length == 0) {
            return new Person[]{};
        }

        Person[] level = persons;


        return persons;
    }

    // O(N)
    public static int getAllPersonLevel(Person[] persons) {

        if (persons == null || persons.length == 0
                || getNullMagicianAstrologer(persons) == -1) {
            return -1;
        }

        int allLevel = 0;

        for (Person t : persons) {
            allLevel += t.getLevel();

        }

        return allLevel;
    }


    //O(N)
    private static int getNullMagicianAstrologer(Person[] persons) {
        int stat = 0;

        for (Person person : persons) {
            if (person == null) {
                stat = -1;
                break;
            }
        }


        return stat;
    }


}