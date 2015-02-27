/**
 * Created by max on 26/02/2015.
 */
public abstract class HeroAttack {
    abstract public void launch(Hero hero, Hero enemy);

    static public class physical_attack extends HeroAttack{
        public void launch(Hero hero, Hero enemy) {
            System.out.println("BWAAAAAAAAAAAH");
        }
    }

    static class force_attack extends HeroAttack{
        public void launch(Hero hero, Hero enemy) {
        }
    }

    static public class armed_attack extends HeroAttack{
        public void launch(Hero hero, Hero enemy) {
        }
    }

    static public class batarang extends HeroAttack{
        public void launch(Hero hero, Hero enemy) {
        }
    }
}
