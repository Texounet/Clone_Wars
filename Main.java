import java.util.Arrays;

/**
 * Created by max on 25/02/2015.
 */
public class Main {
    public static void main(String[] args) {
        Init init = new Init();
        PrinterScanner printerScanner = new PrinterScanner();

        // on creer le Héro
        Hero hero = init.getHeroClass();
        ChoixAction rd = new ChoixAction(0, hero);
    }
}
