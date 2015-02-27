import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


public class Combat{
	
	public Combat(Ennemis bot,int lvl_room, Hero hero){
		//System.out.println(bot.pattern.getHp());	
		//Text de début de combat
		System.out.println("Vous rentrer dans une sale dite de niveau "+lvl_room+ ". Dans cette salle vous rencontrer un "+bot.pattern.getName()+" qui vous attaque!");
		System.out.println("(Oublier pas de faire 'help' pour connaitre les différente attaque de votre personnage ;) )");
		int vie_enn = bot.pattern.getHp();
		int vie_hero = hero.stats.getHp();
		
		System.out.println("Vous rentré en combat: ");
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
		     if (Arrays.asList(hero.stats.HeroAttack).contains(chooseAttack)) {
		    	 hero.stats.HeroAttacks.get(chooseAttack).launch(hero, hero);
		     }
		         
		        
			if(ordreAttaque() == 1){    
				bot.pattern.setHp(vie_enn);
				System.out.println(bot.pattern.getName()+" "+vie_enn);
				if(bot.pattern.getHp() <= 0){
					break;
				}
				vie_hero = vie_hero-100;
				hero.stats.setHp(vie_hero);
				System.out.println("hero: "+vie_hero);
				if(hero.stats.getHp() <= 0){
					break;
				}
			}
			else{
				vie_hero = vie_hero-100;
				hero.stats.setHp(vie_hero);
				System.out.println("hero: "+vie_hero);
				if(hero.stats.getHp() <= 0){
					break;
				}
				vie_enn = vie_enn-100;
				bot.pattern.setHp(vie_enn);
				System.out.println(bot.pattern.getName()+" "+vie_enn);
				if(bot.pattern.getHp() <= 0){
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