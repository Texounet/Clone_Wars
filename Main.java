import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by max on 25/02/2015.
 */
public class Main {

    int[] stats = {};

    public static void main(String[] args) {
        System.out.println("Insert your Pseudo" + "\n");
        String name = ReadPrompt();
        System.out.println("Insert your class" + "\n");
        String chooseClass = ReadPrompt();
        HashMap<String, Pattern> Heroclasses = new HashMap<String, Pattern>();
        Heroclasses.put("Jedi", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("Sith", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("BountyHunter", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("ImperialAgent", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("Mercenary", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("Jawa", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("Batman", new Pattern(100, 200, 100, 200, 200));

        Hero hero = new Hero(Heroclasses.get(chooseClass), name);

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
