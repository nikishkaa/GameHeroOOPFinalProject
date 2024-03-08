package by.itstep.goutor.finaloopproject.util.UI;

import by.itstep.goutor.finaloopproject.model.charecter.Person;

import java.util.Arrays;

public class PersonUI {
    public static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static StringBuilder getUserUI(Person[] persons, int allLevel) {


        return BUILDER.append("Persons\n").append(Arrays.toString(persons))
                .append("\nAll level ").append(allLevel);
    }
}
