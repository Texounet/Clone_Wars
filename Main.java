import org.omg.CORBA.DefinitionKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by max on 25/02/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Choose your class : " + "\n" +
                "Power : 1 = Jedi, 2 = Sith" + "\n" +
                "No Power 3 = bountyHunter, 4 = ImperialAgent, 5 = Mercenary, 6 = Jawa" + "\n");
        int Define = 0;
        while (Define == 0) {
            String read = ReadPrompt();
            int HeroClass = Integer.parseInt(read);
            Define = 1;
            switch (HeroClass) {
                case 1:
                    Jedi hero = new Jedi("name");
                    System.out.println(hero.name);
                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    Define = 0;
                    System.out.println("This class doesn't exist");
            }
        }

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
