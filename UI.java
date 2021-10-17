import java.util.Scanner;
import java.io.*;

public class UI {
	
	// properties
	static String playerCommand;
	static String postCommandMessage;
	String validPlayerCommands[] = {"q", "n", "s", "e", "w"};
	

public static void executePlayercommand() {
	
	postCommandMessage = ""; // start blank message
	
	int x = GameMap.getPlayerCoordinateX();
	int y = GameMap.getPlayerCoordinateY();
	
	switch(playerCommand) {
		case "n": // north
			postCommandMessage = "You travel north.";
			GameMap.setPlayerDestination( x,(y-1) );
			break; 
		case "s": // south
			postCommandMessage = "You travel south.";
			GameMap.setPlayerDestination( x,(y+1) );
			break;
		case "e": // east
			postCommandMessage = "You travel east.";
			GameMap.setPlayerDestination( (x+1), y );
			break;
		case "w": // west
			postCommandMessage = "You travel west.";
			GameMap.setPlayerDestination( (x-1), y );
			break;
		case "q": // quit game
			Main.gameRunning = false;
			break;
		}	
		
} // close executePlayercommand


	
	// constructor
	public UI() {}
	
	// get player command
	public void getPlayerCommand() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.printf("Command --> ");
		playerCommand = input.nextLine(); 
		playerCommand = playerCommand.toLowerCase();
		
		// check in player command is in array of valid commands
		boolean isCommandValid = false;
		
		for (String command : validPlayerCommands) {
			
			if (playerCommand.equals(command) ) {
				isCommandValid = true;
				}
			}
			
		// runs player command if valid 
		if (isCommandValid) {	
			// run execute player command function
			executePlayercommand();

		} else {
			postCommandMessage = "I don't recognize that command.";
			System.out.println(""); // print blank line
			return;
		}
			
	} // close getPlayerCommand function
							
	// getter for postCommandMessage
	public static String getPostCommandMessage() {
		return postCommandMessage;
		}				
	
	
	// start main function
	public static void main(String[] args) {
		
	}
	
} // close class
 	
 
