
public class Factory{
	
	
	public Factory(){ //Création des mobs
		
	}
	
	public Pattern Clone(int lvl_mob){ //Stat Clone
		//hp = 100;
		//def = 100;
		//power = 100;
		//force = 0;
		//intelligence = 0;
		//lvl = 1;
		//System.out.println("Clone");
		Pattern bot =new Pattern(100, 100, 100, 0, 0);
		initLvl(lvl_mob,bot);
		//System.out.println(bot.hp);
		return bot;
	}
	
	public Pattern build(int lvl_room, int rnd){

		//System.out.println(rnd);
		if(rnd < 50){
			return(Clone(lvl_room));
			//System.out.println(hp);
		}
		else if(rnd < 80){
			return(Soldat(lvl_room));
			//System.out.println(hp);
		}
		else{
			return(Droid(lvl_room));
			//System.out.println(hp);
		}
		//init_lvl(5);
		//System.out.println(rnd);
	}

	public Pattern Soldat(int lvl_mob){ //Stat Soldat
		//hp = 100;
		//def = 150;
		//power = 125;
		//force = 0;
		//intelligence = 125;
		//lvl = 1;
		Pattern bot =new Pattern(100, 150, 125, 0, 125);
		//System.out.println("Soldat");
		initLvl(lvl_mob,bot);
		//System.out.println(bot.hp);
		return bot;
	}
	
	public Pattern Droid(int lvl_mob){//Stat Droid
		//hp = 50;
		//def = 100;
		//power = 25;
		//force = 0;
		//intelligence = 200;
		//lvl = 1;
		//System.out.println("Droid");
		Pattern bot =new Pattern(50, 100, 25, 0, 200);
		initLvl(lvl_mob,bot);
		//System.out.println(bot.hp);
		return bot;
	}
	
	public Pattern initLvl(int lvl, Pattern bot){
		while(lvl >  0){
			bot.lvlUp();
			lvl--;
		}
		//85System.out.println(bot.hp);
		return bot;
	}
}
