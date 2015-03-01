import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


public class Combat{
	
	public Combat(Character bot,int lvl_room, Character hero){
		//System.out.println(bot.pattern.getHp());	
		//Text de d�but de combat
		System.out.println("Vous rentrer dans une sale dite de niveau "+lvl_room+ ". Dans cette salle vous rencontrer un "+bot.stats.getName()+" qui vous attaque!");
		System.out.println("(Oublier pas de faire 'help' pour connaitre les diff�rente attaque de votre personnage ;) )");
		int vie_enn = bot.stats.getHp();
		int vie_hero = hero.stats.getHp();
		
		System.out.println("Vous rentr� en combat: ");
		while(vie_enn > 0) { 
			System.out.println("Insert your attack\n");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String commande = null;
			try {
				commande = br.readLine();
			} catch (IOException ioe) {
				System.out.println("IO error trying to read your name!");
				System.exit(1);
			}
		     String chooseAttack = commande;
		    
		         
		        
			if(ordreAttaque() == 1){ 
				 if (Arrays.asList(hero.stats.HeroAttack).contains(chooseAttack)) {
			    	 hero.stats.HeroAttacks.get(chooseAttack).launch(hero, hero);
			     }
				bot.stats.setHp(vie_enn);
				System.out.println(hero.stats.getName()+" "+ hero.stats.hp);//bot
				if(bot.stats.getHp() <= 0){
					break;
				}
				//vie_hero = vie_hero-100; //Remplacer par les attaques
				hero.stats.setHp(vie_hero);
				System.out.println("hero: "+vie_hero);
				if(hero.stats.getHp() <= 0){
					break;
				}
			}
			else{
				//vie_hero = vie_hero-100;
				hero.stats.setHp(vie_hero);
				System.out.println("hero: "+vie_hero);
				if(hero.stats.getHp() <= 0){
					break;
				}
				 if (Arrays.asList(hero.stats.HeroAttack).contains(chooseAttack)) {
			    	 hero.stats.HeroAttacks.get(chooseAttack).launch(hero, hero);
			     }
				//vie_enn = vie_enn-100;
				bot.stats.setHp(vie_enn);
				System.out.println(hero.stats.getName()+" "+ hero.stats.hp);//bot
				if(bot.stats.getHp() <= 0){
					break;
				}
			}
			System.out.println("test");
		}
	}
	
	public int ordreAttaque(){
		Random rand = new Random();
		int rnd = rand.nextInt(2);
		return(rnd);
	}
	
}