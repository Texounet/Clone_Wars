import java.util.Random;

/**
 * Created by tex on 25/02/2015.
 */
public class Room {
	int lvl_room;
	
	public Room(int lvl){
		lvl_room = lvl_room(lvl);
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
		factory();
	}
	
	public int lvl_room(int lvl){
		Random rand = new Random();
		int rnd = rand.nextInt(3);
		lvl = lvl+rnd;
		return lvl;
	}
	
	public void factory(){
		//Ennemis troll = new Ennemis();
		
		int rnd = random();
		//System.out.println(rnd);
		if(rnd < 50){
			Clone monster= new Clone(lvl_room);
			System.out.println(monster.hp);
		}
		else if(rnd < 80){
			Soldat monster= new Soldat(lvl_room);
			System.out.println(monster.hp);
		}
		else{
			Droid monster= new Droid(lvl_room);
			System.out.println(monster.hp);
		}
		
		
		//System.out.println(rnd);
	}
	
	public int random(){
		Random rand = new Random();
		int rnd = rand.nextInt(100);
		//System.out.println(rnd);
		return rnd; 
	}
}
