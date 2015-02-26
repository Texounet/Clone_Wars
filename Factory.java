
public class Factory extends Pattern{
	
	
	public Factory(int lvl_room, int rnd){ //Création des mobs
		
		//System.out.println(rnd);
		if(rnd < 50){
			Clone(lvl_room);
			//System.out.println(hp);
		}
		else if(rnd < 80){
			Soldat(lvl_room);
			//System.out.println(hp);
		}
		else{
			Droid(lvl_room);
			//System.out.println(hp);
		}
		//init_lvl(5);
		//System.out.println(rnd);
	}
	
	public void Clone(int lvl_mob){ //Stat Clone
		hp = 100;
		def = 100;
		power = 100;
		force = 0;
		intelligence = 0;
		lvl = 1;
		//System.out.println("Clone");
		initLvl(lvl_mob);
	}

	public void Soldat(int lvl_mob){ //Stat Soldat
		hp = 100;
		def = 150;
		power = 125;
		force = 0;
		intelligence = 125;
		lvl = 1;
		//System.out.println("Soldat");
		initLvl(lvl_mob);
	}
	
	public void Droid(int lvl_mob){//Stat Droid
		hp = 50;
		def = 100;
		power = 25;
		force = 0;
		intelligence = 200;
		lvl = 1;
		//System.out.println("Droid");
		initLvl(lvl_mob);
	}
	
	public int initLvl(int lvl){
		while(lvl >  0){
			lvlUp();
			lvl--;
		}
		return lvl;
	}
}
