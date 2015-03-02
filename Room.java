import java.util.Random;

/**
 * Created by tex on 25/02/2015.
 */
public class Room{
	int lvl_room;
	
	public Room(){
		
	}
	
	public void room(int lvl, Character hero){
		lvl_room = lvl_room(lvl);
		int rnd = random();
		Factory Mob = new Factory();
		Character bot = Mob.build(lvl_room, rnd);
		//System.out.println(bot.pattern.getHp());
		Combat combat = new Combat(bot, lvl, hero);
        int resultat = combat.launch();
	}
	
	public int lvl_room(int lvl){ //Niveau de la room
		Random rand = new Random();
		int rnd = rand.nextInt(2);
		lvl = lvl+rnd;
		return lvl;
	}
	
	public int random(){ //Rnd de selction des mobs
		Random rand = new Random();
		int rnd = rand.nextInt(100);
		//System.out.println(rnd);
		return rnd; 
	}
}
