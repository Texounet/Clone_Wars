import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by max on 25/02/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        try {
            name = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your name!");
            System.exit(1);
        }
        Power hero = new Power(name, 0);
        System.out.println(hero.name);
    }
}
