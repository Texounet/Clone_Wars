/**
 * Created by max on 26/02/2015.
 */
public abstract class AttackList {
    abstract public void launch(Character hero, Character enemy);

    static int checkDegat(int degat) {
        if (degat < 10 ) {
            degat = 10;
        }
        return degat;
    }

    static public class physical_attack extends AttackList {
        public void launch(Character fighter, Character defender) {
            int degat = checkDegat(fighter.stats.power - defender.stats.def);
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }

    static class force_attack extends AttackList {
        public void launch(Character fighter, Character defender) {
            int degat = checkDegat((fighter.stats.force/10)*2);
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }

    static public class armed_attack extends AttackList {
        public void launch(Character fighter, Character defender) {
            int degat = checkDegat(fighter.stats.intelligence - defender.stats.def);
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }

    static public class batarang extends AttackList {
        public void launch(Character fighter, Character defender) {
            int degat = checkDegat(fighter.stats.power - defender.stats.def);
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }
}
