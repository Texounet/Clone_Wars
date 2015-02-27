/**
 * Created by max on 26/02/2015.
 */
public abstract class HeroAttack {
    abstract public void launch(Hero hero, Hero enemy);

    static public class physical_attack extends HeroAttack{
        public void launch(Hero fighter, Hero defender) {
            int degat = fighter.stats.power - defender.stats.def;
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }

    static class force_attack extends HeroAttack{
        public void launch(Hero fighter, Hero defender) {
            int degat = (fighter.stats.force/10)*2;
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }

    static public class armed_attack extends HeroAttack{
        public void launch(Hero fighter, Hero defender) {
            int degat = fighter.stats.intelligence - defender.stats.def;
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }

    static public class batarang extends HeroAttack{
        public void launch(Hero fighter, Hero defender) {
            int degat = fighter.stats.power - defender.stats.def;
            System.out.println(fighter.stats.name + " inflige  "+degat+" a "+defender.stats.name);
            defender.stats.hp -= degat;
        }
    }
}
