/**
 * Created by max on 25/02/2015.
 */
public abstract class Pattern {
    protected int hp;
    protected int def;
    protected int power;
    protected int force;
    protected int intelligence;
    protected int lvl;
    protected String name;

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setName(String name) {
        this.name = name;
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
    }
    public void physicalAttack() {

    }
}
