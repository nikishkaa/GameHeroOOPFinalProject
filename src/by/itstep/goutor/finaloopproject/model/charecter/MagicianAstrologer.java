package by.itstep.goutor.finaloopproject.model.charecter;

public class MagicianAstrologer extends Person {
    private String name;
    private boolean alive;
    private int health; // текущее здоровье
    private int level; // уровень
    private int force; // сила


    public MagicianAstrologer(String name, boolean alive, int health, int level, int force) {
        super(name, alive, health, level, force);
        this.name = name;
        this.alive = alive;
        this.health = health;
        this.level = level;
        this.force = force;
    }
    public  MagicianAstrologer(){

    }


    @Override
    public String toString() {
        return "MagicianAstrologer{" +
                "name = '" + name + '\'' +
                ", alive = " + alive +
                ", health = " + health +
                ", level = " + level +
                ", force = " + force +
                '}';
    }

}

