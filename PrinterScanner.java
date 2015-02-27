import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by max on 27/02/2015.
 */
public class PrinterScanner {
    public void printTab(String[] tab) {
        int i = 1;
        for (String s : tab) {
            System.out.println(i + " = " + s);
            i++;
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
