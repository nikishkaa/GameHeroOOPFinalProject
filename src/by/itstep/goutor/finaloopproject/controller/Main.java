package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.charecter.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.charecter.Person;
import by.itstep.goutor.finaloopproject.model.logic.PersonManager;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MagicianAstrologer magicianAstrologer1 =
                new MagicianAstrologer("1", true, 100, 50, 20);

        MagicianAstrologer magicianAstrologer2 =
                new MagicianAstrologer("2", true, 100, 40, 10);


        Person[] persons = new Person[]{magicianAstrologer1, magicianAstrologer2};

        Person[] level = PersonManager.getBiggestLevelPerson(persons);



        System.out.println(Arrays.toString(level));
    }
}
