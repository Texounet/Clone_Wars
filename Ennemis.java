
/**
 * Created by tex on 25/02/2015.
 */
public class Ennemis extends Room{
	
	public Ennemis(){
		
	}
	
	public int init_lvl(int lvl){
		while(lvl >  0){
			lvlUp();
			lvl--;
		}
		return lvl;
	}
}
