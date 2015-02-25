import java.util.Random;

/**
 * Created by tex on 25/02/2015.
 */
public class Ennemis  extends Pattern{
	
	public Ennemis(int lvl){
		
		int rnd = random();
		if(rnd < 50){
			Clone();
		}
		else if(rnd < 80){
			Soldat();
		}
		else{
			Droid();
		}
	}
	
	public int random(){
		Random rand = new Random();
		int rnd = rand.nextInt(100);
		return rnd; 
	}
	public void Clone(){
		hp = 1000;
		def = 100;
		power = 100;
		force = 0;
		intelligence = 0;
	}
	
	public void Soldat(){
		hp = 100;
		def = 150;
		power = 125;
		force = 0;
		intelligence = 125;
	}
	
	public void Droid(){
		hp = 50;
		def = 100;
		power = 25;
		force = 0;
		intelligence = 200;
	}
}
