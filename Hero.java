import java.util.HashMap;

/**
 * Created by max on 26/02/2015.
 */
public class Hero {
    public Pattern stats;
    public HashMap<String, AttackList> HeroAttack;

    public Hero(Pattern stats, String name) {
        this.HeroAttack = HeroAttack;
        this.stats = stats;
        stats.setName(name);
    }
}
