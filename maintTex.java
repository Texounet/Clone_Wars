import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class maintTex {

	public static void main(String[] args) {
		
		//Ennemis test = new Ennemis(2);
		//System.out.println(test.hp);
		Init init = new Init();
        // on creer le Héro
        Hero hero = init.getHeroClass();
	        ChoixAction rd = new ChoixAction(0, hero);
	        //System.out.println(rd.lvl_room);
	        //System.out.println(test);
	}
	
   public static String ReadPrompt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException ioe) {
            return "Erreur";
        }
    } 
}
