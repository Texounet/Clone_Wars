import java.util.HashMap;

/**
 * Created by max on 25/02/2015.
 */
public class Pattern {
    protected int hp;
    protected int def;
    protected int power;
    protected int force;
    protected int intelligence;
    protected int lvl;
    protected int xp;
    protected String Class;
    protected String name;
    protected HashMap<String, HeroAttack> HeroAttacks;
    protected String[] HeroAttack;

    public Pattern(int hp, int def, int power, int force, int intelligence,String Class, HashMap<String, HeroAttack> HeroAttacks, String[] HeroAttack) {
        this.hp = hp;
        this.def = def;
        this.power = power;
        this.force = force;
        this.intelligence = intelligence;
        this.lvl = 1;
        this.xp = 0;
        this.Class = Class;
        this.HeroAttacks = HeroAttacks;
        this.HeroAttack = HeroAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDef() {
        return this.def;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getForce() {
        return this.force;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void lvlUp() {
        setHp((int) Math.round((double) (getHp() * 1.5)));
        setDef((int) Math.round((double) (getDef() * 1.5)));
        setPower((int) Math.round((double) (getPower() * 1.5)));
        setForce((int) Math.round((double) (getForce() * 1.5)));
        setIntelligence((int) Math.round((double) (getIntelligence() * 1.5)));
        setLvl(getLvl() + 1);
    }
}
