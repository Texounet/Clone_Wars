import java.util.HashMap;


public class Factory{
	
	
	public Factory(){ //Cr�ation des mobs
		
	}
	
	public Ennemis build(int lvl_room, int rnd){

		HashMap<String, Pattern> bot = new HashMap<String, Pattern>();
		bot.put("Droid", new Pattern(50, 100, 25, 0, 200, "Droid"));
		bot.put("Clone", new Pattern(100, 100, 100, 0, 0, "Clone"));
		bot.put("Soldat", new Pattern(100, 150, 125, 0, 125, "Soldat"));
		String botName = null;
		
		//System.out.println(rnd);
		if(rnd < 50){
			botName = "Clone";
		}
		else if(rnd < 80){
			botName = "Soldat";
		}
		else{
			botName = "Droid";
		}
		
		Ennemis ennemi = new Ennemis(bot.get(botName));
		ennemi.lvlUp(lvl_room);
		ennemi.pattern.setName(botName);
		
		return ennemi;
		//initLvl(lvl_room,ennemi);
		//init_lvl(5);
		//System.out.println(rnd);
	}
}
