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

        System.out.println("Insert your attack" + "\n");
        String chooseAttack = printerScanner.ReadPrompt();
        if (Arrays.asList(hero.stats.HeroAttack).contains(chooseAttack))
            System.out.println("BITCHES");
    }
}
