import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class maintTex {

	public static void main(String[] args) {
		//Ennemis test = new Ennemis(2);
		//System.out.println(test.hp);
			Hero hero = getHeroClass();
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
	
	public static Hero getHeroClass() {
        System.out.println("Insert your Pseudo" + "\n");
        String name = ReadPrompt();
        System.out.println("Insert your class" + "\n");
        HashMap<String, Pattern> Heroclasses = new HashMap<String, Pattern>();
        Heroclasses.put("Jedi", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("Sith", new Pattern(100, 100, 200, 200, 200));
        Heroclasses.put("BountyHunter", new Pattern(100, 100, 100, 0, 350));
        Heroclasses.put("ImperialAgent", new Pattern(350, 100, 100, 0, 100));
        Heroclasses.put("Mercenary", new Pattern(100, 350, 100, 0, 100));
        Heroclasses.put("Jawa", new Pattern(400, 400, 400, 0, 400));
        Heroclasses.put("PyjamaBatman", new Pattern(1000, 1000, 1000, 0, 1000));
        Hero hero = null;
        int Define = 0;
        while (Define != 1) {
            String chooseClass = ReadPrompt();
            if (Heroclasses.containsKey(chooseClass)) {
                hero = new Hero(Heroclasses.get(chooseClass), name);
                Define = 1;
            } else {
                System.out.println("This class doesn't exist" + "\n");
            }
        }
        return hero;
    }
}
