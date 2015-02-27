import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ChoixAction {
	
	private static boolean isInteger(String s) {
	       boolean isValid = true;
	       try{ Integer.parseInt(s); }
	       catch(NumberFormatException nfe){ isValid = false; }
	       return isValid;
	   }
	
	public ChoixAction(int win, Hero hero){
		while(win == 0){
			System.out.println("Choisisez votre prochaine salle :");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String lvl_salle = null;
			try {
				lvl_salle = br.readLine();
			} catch (IOException ioe) {
				System.out.println("IO error trying to read your name!");
				System.exit(1);
			}
			if(isInteger(lvl_salle) == true){
				Room rd = new Room();
				rd.room(Integer.parseInt(lvl_salle), hero);
			}
			else if(lvl_salle.compareTo("help") == 0 ||lvl_salle.compareTo("h") == 0 ){
				System.out.println("Ici vous pouvez soit: \n -Rentrer directement le numéro de la salle(ex: 5) \n -Taper'info' pour voir vos statut actuel\n");
			}
			else if(lvl_salle.compareTo("stat") == 0 ||lvl_salle.compareTo("s") == 0 ){
				System.out.println(hero.stats.getName()+":\nNiveau "+hero.stats.getLvl()+":\nHp :"+hero.stats.getHp()+"\nDef: "+ hero.stats.getDef()+"\nPower : "+ hero.stats.getPower()+"\nForce : "+hero.stats.getForce()+"\nIntel : "+hero.stats.getIntelligence()+"\n");
			}
			else{
				System.out.println("Vous devez rentrez le niveau de la salle où vous désirez vous rendre.");
			}
		}
	}
}
