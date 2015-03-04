
public abstract class Item {
	 abstract public void item(Character hero);
	 
	 static public class popo extends Item {
        public void item(Character hero) {

        	if(hero.stats.gold >= 50){
        		System.out.println("Vous venez d'acheter une potion.");
        		int tempo = hero.stats.nbPotion + 1;
        		hero.stats.nbPotion = tempo;
        		hero.stats.setGold(hero.stats.getGold() - 50);
        	}
        	else{
        		System.out.println("Vous n'avez pas assez d'or.");
        	}
        }
	 }
	 
	 static public class att extends Item {
        public void item(Character hero) {

        	if(hero.stats.gold >= 50){
        		System.out.println("Vous venez d'augmenter votre attaque.");
        		int tempo = (hero.stats.getPower() / 100) * 10;
        		hero.stats.setPower(tempo);
        		hero.stats.setGold(hero.stats.getGold() - 50);
        	}
        	else{
        		System.out.println("Vous n'avez pas assez d'or.");
        	}
        }
	 }
	 
	 static public class def extends Item {
        public void item(Character hero) {
        	if(hero.stats.gold >= 50){
        		System.out.println("Vous venez d'augmenter votre defense.");
        		int tempo = (hero.stats.getDef() / 100) * 10;
    			hero.stats.setDef(tempo);
    			hero.stats.setGold(hero.stats.getGold() - 50);
        	}
    		else{
    			System.out.println("Vous n'avez pas assez d'or.");
    		}
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
             System.out.println("Liste des commandes utilisable");
             System.out.println("'exit': Quitte le magasin");
             System.out.println("'att': Améliore l'attaque");
             System.out.println("'def': Améliore la defense");
             System.out.println("'popo': Achete une potion");
             System.out.println("'bonjour' : dire bonjour");
         }
     }
}
