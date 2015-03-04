/**
 * Created by max on 26/02/2015.
 */
public abstract class AttackList {
    abstract public boolean launch(Character hero, Character enemy);

    PrinterScanner printer = new PrinterScanner();

    static int checkDegat(int degat) {
        if (degat < 10) {
            degat = 10;
        }
        return degat;
    }

    static public class physical_attack extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            int degat = checkDegat(fighter.stats.power - defender.stats.def);
            printer.print(fighter.stats.getName()+" punch you !");
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static class force_attack extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print("You get strangled!");
            int degat = checkDegat((fighter.stats.force / 10) * 2);
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static public class armed_attack extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print(defender.stats.getName()+" took two blaster!");
            int degat = checkDegat(fighter.stats.intelligence - defender.stats.def);
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static public class batarang extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            int degat = checkDegat(fighter.stats.power - defender.stats.def);
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static public class help extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print("You can use : ");
            printer.printTab(fighter.stats.HeroAttack, 0);
            return false;
        }
    }

    static public class heal extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            if(fighter.stats.nbPotion > 0) {
                int soin = ((fighter.stats.hpMax/100)*25);
                printer.print("The potion restored you "+soin+" HP");
                fighter.stats.nbPotion -= 1;
                fighter.stats.hp += soin;
                return true;
            } else {
                printer.print("You don't have potion, go to the Shop");
                return false;
            }
        }
    }
}
