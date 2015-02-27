import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by max on 25/02/2015.
 */
public class Main {
    static String[] Classes = {"Jedi", "Sith", "BountyHunter", "ImperialAgent", "ImperialAgent", "Mercenary", "Jawa", "PyjamaBatman"};
    public static void main(String[] args) {
        Hero hero = getHeroClass();

        System.out.println("Insert your attack" + "\n");
        String chooseAttack = ReadPrompt();
        hero.HeroAttack.get(chooseAttack).launch(hero, hero);
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
        HashMap<String, Pattern> Heroclasses = new HashMap<String, Pattern>();
        Heroclasses.put("Jedi", new Pattern(100, 200, 100, 200, 200));
        Heroclasses.put("Sith", new Pattern(100, 100, 200, 200, 200));
        Heroclasses.put("BountyHunter", new Pattern(100, 100, 100, 0, 350));
        Heroclasses.put("ImperialAgent", new Pattern(350, 100, 100, 0, 100));
        Heroclasses.put("Mercenary", new Pattern(100, 350, 100, 0, 100));
        Heroclasses.put("Jawa", new Pattern(400, 400, 400, 0, 400));
        Heroclasses.put("PyjamaBatman", new Pattern(1000, 1000, 1000, 0, 1000));
        Hero hero = null;

        Printer printer = new Printer();
        System.out.println("Insert your Pseudo" + "\n");
        String name = ReadPrompt();
        System.out.println("Choose your class");
        printer.printTab(Classes);
        int Define = 0;
        while (Define != 1) {
            String chooseClass = Classes[Integer.parseInt(ReadPrompt())-1];
            if (Heroclasses.containsKey(chooseClass)) {
                hero = new Hero(Heroclasses.get(chooseClass), name, Heroclasses.get(chooseClass).getSpells());
                Define = 1;
            } else {
                System.out.println("This class doesn't exist" + "\n");
            }
        }
        return hero;
    }
}
