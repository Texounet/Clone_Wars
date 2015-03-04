import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Magasin {
	
	public  Magasin(){
	}
	
	public void menu(){
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
			if(Action.compareTo("exit") == 0){
				nb_ac = 1;
			}
			else if(Action.compareTo("bonjour") == 0){
				//bonjour();
			}
			else if(Action.compareTo("h") == 0 || Action.compareTo("help") == 0 ){
				//help();
			}
			else{
				System.out.println("Votre commande est invalide. Consulter l'aide grace � la commande h ou 'help'");
			}
		}
	}
}
