package by.itstep.goutor.finaloopproject.controller;

import by.itstep.goutor.finaloopproject.model.charecter.MagicianAstrologer;
import by.itstep.goutor.finaloopproject.model.charecter.Person;
import by.itstep.goutor.finaloopproject.model.logic.PersonManager;
import by.itstep.goutor.finaloopproject.util.UI.PersonUI;
import by.itstep.goutor.finaloopproject.view.Printer;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        MagicianAstrologer magicianAstrologer1 =
                new MagicianAstrologer("1", true, 100, 50, 20);

        MagicianAstrologer magicianAstrologer2 =
                new MagicianAstrologer("2", true, 100, 40, 10);

        MagicianAstrologer magicianAstrologer3 = null;

        Person[] persons = new Person[]{magicianAstrologer1, magicianAstrologer2,magicianAstrologer3};


        int allLevel = PersonManager.getAllPersonLevel(persons);



        System.out.println(allLevel + " - All Person Level");
        System.out.println(Arrays.toString(persons));


        Printer.print(PersonUI.getUserUI());
    }
}
