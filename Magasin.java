import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class Magasin {
	
	public  Magasin(){
	}
	
	public void menu(Character hero){
		
		HashMap<String, Item> getItem = new HashMap<String, Item>();
		getItem.put("popo", new Item.popo());
		getItem.put("att", new Item.att());
		getItem.put("def", new Item.def());
		getItem.put("bonjour", new Item.bonjour());
		getItem.put("help", new Item.help());
		
		String tabItem [] = new String [5];
		tabItem[0] = "popo";
		tabItem[1] = "att";
		tabItem[2] = "def";
		tabItem[3] = "bonjour";
		tabItem[4] = "help";
		
		int nb_ac = 0;	
		System.out.println("Bienvenut dans le magasin");
		while(nb_ac == 0){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String Action = null;
			try {
				Action = br.readLine();
			} catch (IOException ioe) {
				System.out.println("IO error trying to read your name!");
				System.exit(1);
			}
			if (Arrays.asList(tabItem).contains(Action)) {
				getItem.get(Action).item(hero);
				System.out.println("Voulez-vous autre chose?");
            }
			else if(Action.compareTo("exit") == 0){
				nb_ac = 1;
				System.out.println("Merci de votre visite");
			}
			else{
				System.out.println("Votre commande est invalide. Consulter l'aide grace à la commande h ou 'help'");
			}
		}
	}
}
