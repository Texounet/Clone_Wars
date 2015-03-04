
public abstract class Item {
	 abstract public void item(Character hero);
	 
	 static public class popo extends Item {
        public void item(Character hero) {
        	
        }
	 }
	 
	 static public class att extends Item {
        public void item(Character hero) {
        	int tempo = (hero.stats.getPower() / 100) * 10;
    		hero.stats.setPower(tempo);
        }
	 }
	 
	 static public class def extends Item {
        public void item(Character hero) {
        	int tempo = (hero.stats.getDef() / 100) * 10;
    		hero.stats.setDef(tempo);
        }
	 }
	 
	 static public class bonjour extends Item {   
        public void item(Character hero) {
        	System.out.println(hero.stats.getName()+": 'Bonjour'");
    		System.out.println("Marchand: 'Bonjour vous m'avez l'air fort sympatique voici une potion offerte par la maison'.");
    		System.out.println("*Vous obtenez une potion*");
        }
	 }
	 
	 static public class help extends Item {   
	        public void item(Character hero) {
	        	System.out.println("Liste des commandes:");
	    		System.out.println("'exit': Quite le magasin");
	    		System.out.println("'att': Ameliore l'attaque");
	    		System.out.println("'def': Ameliore la defense");
	    		System.out.println("'popo': Achete un potion");
	    		System.out.println("'bonjour': Dire bonjour au vendeur");
	        }
		 }
}
