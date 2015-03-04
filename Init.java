import java.util.HashMap;

/**
 * Created by max on 27/02/2015.
 */
public class Init {
    static String[] Classes = {"Jedi", "Sith", "BountyHunter", "ImperialAgent", "ImperialAgent", "Mercenary", "Jawa", "PyjamaBatman"};

    public static Character getHeroClass() {
        PrinterScanner printerScanner = new PrinterScanner();
        Character hero = null;

        HashMap<String, AttackList> getSpells = new HashMap<String, AttackList>();
        getSpells.put("physical_attack", new AttackList.physical_attack());
        getSpells.put("force_attack", new AttackList.force_attack());
        getSpells.put("armed_attack", new AttackList.armed_attack());
        getSpells.put("batarang", new AttackList.batarang());
        getSpells.put("help", new AttackList.help());
        getSpells.put("heal", new AttackList.heal());


        HashMap<String, Pattern> Heroclasses = new HashMap<String, Pattern>();
        Heroclasses.put("Jedi", new Pattern(100, 200, 100, 200, 200, "Jedi", getSpells, new String[] {"help", "heal", "physical_attack", "force_attack"},0,100,0));
        Heroclasses.put("Sith", new Pattern(100, 100, 200, 200, 200, "Sith", getSpells, new String[] {"help", "heal", "physical_attack", "force_attack"},0,100,0));
        Heroclasses.put("BountyHunter", new Pattern(100, 100, 100, 0, 350, "BountyHunter", getSpells, new String[] {"help", "heal", "physical_attack", "armed_attack"},0,100,0));
        Heroclasses.put("ImperialAgent", new Pattern(350, 100, 100, 0, 100, "ImperialAgent", getSpells, new String[] {"help", "heal", "physical_attack", "armed_attack"},0,100,0));
        Heroclasses.put("Mercenary", new Pattern(100, 350, 100, 0, 100, "Mercenary", getSpells, new String[] {"help", "heal", "physical_attack", "armed_attack"},0,100,0));
        Heroclasses.put("Jawa", new Pattern(400, 400, 400, 0, 400, "Jawa", getSpells, new String[] {"help", "heal", "physical_attack", "armed_attack"},0,100,0));
        Heroclasses.put("PyjamaBatman", new Pattern(1000, 1000, 1000, 0, 1000, "PyjamaBatman", getSpells, new String[]{"help", "heal", "physical_attack", "armed_attack"}, 0,100,0));

        System.out.println("Insert your Pseudo" + "\n");
        String name = printerScanner.ReadPrompt();
        System.out.println("Choose your class");
        printerScanner.printTab(Classes, 1);
        int Define = 0;
        while (Define != 1) {
            String chooseClass = Classes[Integer.parseInt(printerScanner.ReadPrompt())-1];
            if (Heroclasses.containsKey(chooseClass)) {
                hero = new Character(Heroclasses.get(chooseClass), name);
                Define = 1;
            } else {
                System.out.println("This class doesn't exist" + "\n");
            }
        }
        return hero;
    }
}
