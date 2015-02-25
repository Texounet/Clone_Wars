import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class maintTex {

	public static void main(String[] args) {
		//Ennemis test = new Ennemis(2);
		//System.out.println(test.hp);

		 System.out.print("Enter le niveau de difficullté: ");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String name = null;
	        try {
	            name = br.readLine();
	        } catch (IOException ioe) {
	            System.out.println("IO error trying to read your name!");
	            System.exit(1);
	        }
	        Room rd = new Room(Integer.parseInt(name));
	        //System.out.println(rd.lvl_room);
		//System.out.println(test);
	}
}
