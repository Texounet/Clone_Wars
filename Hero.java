import java.util.HashMap;

/**
 * Created by max on 26/02/2015.
 */
public class Hero {
    public Pattern stats;
    public HashMap<String, HeroAttack> HeroAttack;

    public Hero(Pattern stats, String name, HashMap<String, HeroAttack> HeroAttack) {
        this.HeroAttack = HeroAttack;
        this.stats = stats;
        stats.setName(name);
    }
}
