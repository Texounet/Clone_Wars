
/**
 * Created by tex on 25/02/2015.
 */
public class Ennemis{
	protected Pattern pattern;
	public Ennemis(Pattern pattern){
		this.pattern = pattern;
		
	}
	
	public void lvlUp(int lvl){
		while(lvl >  0){
			pattern.lvlUp();
			lvl--;
		}
	}	
}
