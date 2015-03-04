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
            printer.print(fighter.stats.getName()+" s'approche et frappe!");
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static class force_attack extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print("La force afflue en vous, une onde de choc atteint le " + defender.stats.getName());
            int degat = checkDegat((fighter.stats.force / 10) * 2);
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static public class armed_attack extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print("Deux blaster touchent " + defender.stats.getName());
            int degat = checkDegat(fighter.stats.intelligence - defender.stats.def);
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static public class batarang extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print("Le Batman lance sont Batarang, il fait deux trois tour sur lui même et atteint le " + defender.stats.getName()+" entre les deux yeaux");
            int degat = checkDegat(fighter.stats.power - defender.stats.def);
            printer.printDamage(fighter, defender, degat);
            defender.stats.hp -= degat;
            return true;
        }
    }

    static public class help extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            printer.print("Les commandes utilisables sont : ");
            printer.printTab(fighter.stats.HeroAttack, 0);
            return false;
        }
    }

    static public class heal extends AttackList {
        public boolean launch(Character fighter, Character defender) {
            if(fighter.stats.nbPotion > 0) {
                int soin = ((fighter.stats.hpMax/100)*25);
                printer.print("La potion vous rend " + soin + " PV");
                fighter.stats.nbPotion -= 1;
                fighter.stats.hp += soin;
                return true;
            } else {
                printer.print("Vous n'avez pas de potion ");
                return false;
            }
        }
    }
}
