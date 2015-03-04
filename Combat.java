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
        //System.out.println(hero.stats.getXp());
        //System.out.println(bot.stats.getXp());
        //System.out.println(hero.stats.getXpLvl());
        System.out.println("Debut du combat");
        int round = 1;
        int Combat_over = 0;
        while (Combat_over == 0) {
            System.out.println("\nRound n°" + round + "\n");
            int random = ordreAttaque();
            if (random == 1) {
                PlayerAttack();
                Combat_over = checkDeath();
                if (Combat_over != 0) { //Stoop le combat
                    continue;
                }
                BotAttack();
                Combat_over = checkDeath();
            } else {
                BotAttack();
                Combat_over = checkDeath();
                if (Combat_over != 0) {
                    continue;
                }
                PlayerAttack();
                Combat_over = checkDeath();
            }
            round++;
        }
        return Combat_over;
    }

    public int ordreAttaque() {
        Random rand = new Random();
        int rnd = rand.nextInt(2);
        return (rnd);
    }

    public void PlayerAttack() {
        boolean bool = false;
        while (!bool) {
            PrinterScanner printer = new PrinterScanner();
            System.out.println("Choose your attack\n");
            String chooseAttack = printer.ReadPrompt();
            if (Arrays.asList(hero.stats.HeroAttack).contains(chooseAttack)) {
                bool = hero.stats.HeroAttacks.get(chooseAttack).launch(hero, bot);
            } else {
                System.out.println("This attack doesn't exist");
            }
        }
    }

    public void BotAttack() {
        bot.stats.HeroAttacks.get("physical_attack").launch(bot, hero);
    }

    public int checkDeath() {
        if (hero.stats.hp < 1)
            return 1;
        else if (bot.stats.hp < 1) {
            addExp(bot, hero);
            addGold(bot, hero);
            return 2;
        } else
            return 0;
    }

    public void addExp(Character bot, Character hero) {
        int tempo = hero.stats.xp + bot.stats.xp;

        if (tempo >= hero.stats.getXpLvl()) {
            hero.stats.lvlUp();
            int tempo2 = hero.stats.getXpLvl() - tempo;
            hero.stats.setXp(tempo2);
        } else {
            hero.stats.setXp(tempo);
        }
    }

    public void addGold(Character bot, Character hero) {
        int tempo = bot.stats.getGold() + hero.stats.getGold();
        hero.stats.setGold(tempo);
    }

}