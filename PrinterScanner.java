import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by max on 27/02/2015.
 */
public class PrinterScanner {
    public void printTab(String[] tab, int number) {
        int i = 1;
        String toprint = "";
        for (String s : tab) {
            if (number == 1) {
                toprint += i + " = " + s+ "\n";
            } else {
                toprint +=  s+ ", ";
            }
            i++;
        }
        System.out.println(toprint);
    }



    public String ReadPrompt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException ioe) {
            return "Erreur";
        }
    }

    public void printDamage(Character fighter, Character Defender, int damage) {
        System.out.println(Defender.stats.name + " perd "+ damage+ " HP");
    }

    public void print(String string) {
        System.out.println(string);
    }
}
