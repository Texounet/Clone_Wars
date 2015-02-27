import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Combat{
	
	public Combat(Ennemis bot,int lvl_room, Hero hero){
		//System.out.println(bot.pattern.getHp());	
		//Text de début de combat
		System.out.println("Vous rentrer dans une sale dite de niveau "+lvl_room+ ". Dans cette salle vous rencontrer un "+bot.pattern.getName()+" qui vous attaque!");
		System.out.println("(Oublier pas de faire 'help' pour connaitre les différente attaque de votre personnage ;) )");
		int i = bot.pattern.getHp();
		while(i > 0) { 
			System.out.println("Vous rentré en combat: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String commande = null;
			try {
				commande = br.readLine();
			} catch (IOException ioe) {
				System.out.println("IO error trying to read your name!");
				System.exit(1);
			}
			if(ordreAttaque() == 1){
				i = i-100;
				bot.pattern.setHp(i);
				System.out.println(i);
				if(bot.pattern.getHp() <= 0){
					break;
				}
			}
			else{
				System.out.println("Ba non connard");
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