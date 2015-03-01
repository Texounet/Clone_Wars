import java.util.Arrays;
import java.util.Random;


public class Combat {
    Character bot;
    Character hero;
    int lvl_room;

    public Combat(Character bot, int lvl, Character hero) {
        this.bot = bot;
        this.hero = hero;
        lvl_room = lvl;
    }

    public int launch() {
        //Text de debut de combat
        System.out.println("Vous rentrez dans la zone " + lvl_room + ". Un " + bot.stats.getName() + " de niveau " + bot.stats.getLvl() + " vous attaque!");
        System.out.println("La commande help permet de connaitre les attaques utilisable par " + hero.stats.getName());
        System.out.println("Debut du combat");

        int Combat_over = 0;
        while (Combat_over == 0) {
            if (ordreAttaque() == 1) {
                PlayerAttack();
            } else {
                BotAttack();
            }
            Combat_over = checkDeath() ;
            if (Combat_over != 0) {
                continue;
            }
            if (ordreAttaque() == 1) {
                BotAttack();
            } else {
                PlayerAttack();
            }
            if (checkDeath() == 1) {
                Combat_over = 1;
            }
        }
        return Combat_over;
    }

    public int ordreAttaque() {
        Random rand = new Random();
        int rnd = rand.nextInt(2);
        return (rnd);
    }

    public void PlayerAttack() {
        boolean bool = true;
        while (bool) {
            System.out.println("Choose your attack\n");
            PrinterScanner printer = new PrinterScanner();
            String chooseAttack = printer.ReadPrompt();
            if (Arrays.asList(hero.stats.HeroAttack).contains(chooseAttack)) {
                hero.stats.HeroAttacks.get(chooseAttack).launch(hero, bot);
                bool = false;
            } else {
                System.out.println("This attack doesn't exist");
            }
        }
    }

    public void BotAttack() {
        bot.stats.HeroAttacks.get("physical_attack").launch(bot, hero);
    }

    public int checkDeath() {
        return 1;
    }

}