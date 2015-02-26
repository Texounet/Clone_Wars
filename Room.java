import java.util.Random;

/**
 * Created by tex on 25/02/2015.
 */
public class Room extends Pattern{
	int lvl_room;
	
	public Room(int lvl){
		lvl_room = lvl_room(lvl);
		int rnd = random();
		Factory Mob = new Factory(lvl_room, rnd);
		//System.out.println(Mob.hp);
	}
	
	public int lvl_room(int lvl){ //Niveau de la room
		Random rand = new Random();
		int rnd = rand.nextInt(3);
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
