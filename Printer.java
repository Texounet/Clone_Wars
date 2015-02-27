/**
 * Created by max on 27/02/2015.
 */
public class Printer {
    public void printTab(String[] tab) {
        int i = 1;
        for (String s : tab) {
            System.out.println(i + " = " + s);
            i++;
        }
    }
}
