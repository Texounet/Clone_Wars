import org.omg.CORBA.DefinitionKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by max on 25/02/2015.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Insert your Pseudo" + "\n");
        String name = ReadPrompt();
        System.out.println("Choose your class : " + "\n" +
                "With  : 1 = Jedi, 2 = Sith" + "\n" +
                "Without  3 = bountyHunter, 4 = ImperialAgent, 5 = Mercenary, 6 = Jawa" + "\n");
        int Define = 1;
        while (Define != 0) {
            String read = ReadPrompt();
            int HeroClass = Integer.parseInt(read);
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
