package mru.game.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import mru.game.model.Player;

public class GameManager {
	
	/* In this class you will need these methods:
	 * A constructor
	 * A method to load the txt file into an arraylist (if it exists, so you check if the txt file exists first)
	 * A save method to store the arraylist into the the txt file 
	 * A method to search for a player based their name
	 * A method to find the top players
	 * Depending on your designing technique you may need and you can add more methods here 
	 */

	private ArrayList<Player>players;
	public final String FILE_NAME="res/Casino.txt";

	
	public GameManager() {
		players=new ArrayList<>();
	}
	
	public void LoadData() throws FileNotFoundException {
		File db = new File(FILE_NAME);
		String currentLine;
		String[] splittedLine;
		
		if (db.exists()) {
			Scanner fileReader = new Scanner(db);
			
			while (fileReader.hasNextLine()) {
				
				currentLine = fileReader.nextLine();
				splittedLine = currentLine.split(",");
				Player p = new Player(splittedLine[0], Double.parseDouble(splittedLine[1]), Integer.parseInt(splittedLine[2]));
				players.add(p);	
				
			}
			
			fileReader.close();
		}
	}

	

}
