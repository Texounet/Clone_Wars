/**
 * Created by max on 26/02/2015.
 */
public class Hero {
    private Pattern stats;

    public Hero(Pattern stats, String name) {
        this.stats = stats;
        stats.setName(name);
    }
}
