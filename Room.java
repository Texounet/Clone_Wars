import java.util.Random;

/**
 * Created by tex on 25/02/2015.
 */
public class Room extends Pattern{
	int lvl_room;
	public Room(int lvl){
		lvl_room = lvl_room(lvl);
		factory();
	}
	
	public int lvl_room(int lvl){ //Niveau des mobs cellons le niv de room
		Random rand = new Random();
		int rnd = rand.nextInt(3);
		lvl = lvl+rnd;
		return lvl;
	}
	
	public void factory(){
		Ennemis troll = new Ennemis();
		
		int rnd = random();
		//System.out.println(rnd);
		if(rnd < 50){
			troll.Clone(lvl_room);
			//System.out.println(troll.hp);
		}
		else if(rnd < 80){
			troll.Soldat(lvl_room);
			//System.out.println(troll.hp);
		}
		else{
			troll.Droid(lvl_room);
			//System.out.println(troll.hp);
		}
		troll.init_lvl(5);
		//System.out.println(rnd);
	}
	
	public int random(){
		Random rand = new Random();
		int rnd = rand.nextInt(100);
		//System.out.println(rnd);
		return rnd; 
	}
	
	public void Clone(int level){
		hp = 100;
		def = 100;
		power = 100;
		force = 0;
		intelligence = 0;
		lvl = 1;
		//System.out.println("Clone");
		lvlUp();
	}

	public void Soldat(int level){
		hp = 100;
		def = 150;
		power = 125;
		force = 0;
		intelligence = 125;
		lvl = 1;
		//System.out.println("Soldat");
		lvlUp();
	}
	
	public void Droid(int level){
		hp = 50;
		def = 100;
		power = 25;
		force = 0;
		intelligence = 200;
		lvl = 1;
		//System.out.println("Droid");
		lvlUp();
	}
}
