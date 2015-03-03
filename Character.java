/**
 * Created by max on 26/02/2015.
 */
public class Character {
    public Pattern stats;

    public Character(Pattern stats, String name) {
        this.stats = stats;
        stats.setName(name);
    }

    public void lvlUp(int lvl){
        while(lvl > 0){
        	stats.setGold((int) (Math.round(stats.getGold()*1.5)));
            stats.lvlUp();
            lvl--;
        }
    }
}
