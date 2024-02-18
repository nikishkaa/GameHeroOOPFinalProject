package by.itstep.goutor.finaloopproject.model.charecter;

public class MagicianAstrologer {
    public String name;
    public boolean alive;
    public int health; // текущее здоровье
    public int level; // уровень
    public int healthPoint; // макс здоровье
    public int magicPoint; // макс мана
    public int intelligence; // интеллект
    public int durability; // стойкость
    public int force; // сила
    public int dexterity; // ловкость
    public int wisdom; // мудрость
    public int faith; // вера
    public int witchcraft; // колдовство

    public int maxEquipWeight; // макс вес снаряжения


    public MagicianAstrologer() {
        name = "Magician astrologer";
        alive = true;
        health = 100;
        level = 6;
        healthPoint = 9;
        magicPoint = 10;
        intelligence = 15;
        durability = 9;
        force = 8;
        dexterity = 12;
        wisdom = 16;
        faith = 7;
        witchcraft = 9;
        maxEquipWeight = 40;

    }

    public MagicianAstrologer(String name) {
        this.name = name;
    }

}

