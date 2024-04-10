package by.itstep.goutor.finaloopproject.model.charecter;
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

    public MagicianAstrologer() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return alive;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getForce() {
        return force;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setLevel(int level) {
        if (level >= 0) {
            this.level = level;
        }
    }

    @Override
    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "MagicianAstrologer{" +
                "name = " + name +
                ", alive = " + alive +
                ", health = " + health +
                ", level = " + level +
                ", force = " + force +
                '}';
    }

}

