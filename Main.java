import org.omg.CORBA.DefinitionKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by max on 25/02/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Insert your Pseudo" + "\n");
        String name = ReadPrompt();
        System.out.println("Choose your class : " + "\n" +
                "With Power : 1 = Jedi, 2 = Sith" + "\n" +
                "Without Power 3 = bountyHunter, 4 = ImperialAgent, 5 = Mercenary, 6 = Jawa" + "\n");
        int Define = 0;
        while (Define == 0) {
            String read = ReadPrompt();
            int HeroClass = Integer.parseInt(read);
            Define = 1;
            switch (HeroClass) {
                case 1:
                    Jedi hero = new Jedi();
                    break;
                case 2:
                    Jedi hero = new Jedi();
                    break;
                case 3:
                    Jedi hero = new Jedi();
                    break;
                case 4:
                    Jedi hero = new Jedi();
                    break;
                case 5:
                    Jedi hero = new Jedi();
                    break;
                case 6:
                    Jedi hero = new Jedi();
                    break;
                case 7:
                    System.exit(0);
                default:
                    Define = 0;
                    System.out.println("This class doesn't exist");
            }
            hero.setName(name);
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
