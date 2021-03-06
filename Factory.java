import java.util.HashMap;


public class Factory{
	
	
	public Factory(){ //Creation des mobs
		
	}
	
	public Character build(int lvl_room, int rnd){

		 HashMap<String, AttackList> getSpells = new HashMap<String, AttackList>();
	        getSpells.put("physical_attack", new AttackList.physical_attack());
	        getSpells.put("force_attack", new AttackList.force_attack());
	        getSpells.put("armed_attack", new AttackList.armed_attack());
		
		HashMap<String, Pattern> bot = new HashMap<String, Pattern>();
		bot.put("Droid", new Pattern(50, 100, 25, 0, 200, "Droid", getSpells, new String[] {"physical_attack", "force_attack", "armed_attack"},15,0,50));
		bot.put("Clone", new Pattern(100, 100, 100, 0, 100, "Clone", getSpells, new String[] {"physical_attack", "force_attack", "armed_attack"},20,0,80));
		bot.put("Soldat", new Pattern(100, 150, 125, 0, 125, "Soldat", getSpells, new String[] {"physical_attack", "force_attack", "armed_attack"},25,0,100));
        String botName;
		if(rnd < 50){
			botName = "Clone";
		}
		else if(rnd < 80){
			botName = "Soldat";
		}
		else{
			botName = "Droid";
		}
		
		Character ennemi = new Character(bot.get(botName), botName);
		ennemi.lvlUp(lvl_room);
		ennemi.stats.setName(botName);
		
		return ennemi;
	}
}
