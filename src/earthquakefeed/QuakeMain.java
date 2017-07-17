package earthquakefeed;

import java.util.ArrayList;

public class QuakeMain {

	public static void main(String[] args) {
		
		QuakeMethods qm = new QuakeMethods();
		
		ArrayList<Quake> earthquakes = qm.getQuake("");
		
		System.out.println("TODAY'S EARTHQUAKE 2.5 AND HIGHER");
		System.out.println("Lets see if the git is working or not!!");
		
	}

}
