/**
 * Created by max on 25/02/2015.
 */
public class Power extends Pattern{
    protected int xp;

    public Power(String name, int type) {
        this.name = name;
        setLvl(1);
        xp = 0;
        hp = 100;
        force = 200;
        intelligence = 200;
        if (type == 0) {
            def = 200;
            power = 100;
        }
        else {
            def = 100;
            power = 200;
        }
    }

    public void forceAttack() {

    }
}
