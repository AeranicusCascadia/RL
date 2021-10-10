import java.util.Scanner;
import java.io.*;

public class UI {
	
	// properties
	static String playerCommand;
	String validPlayerCommands[] = {"n", "s", "e", "w"};
	

public static void executePlayercommand() {
	
	

	// switch statement
	switch(playerCommand) {
		case "n":
			System.out.println("You chose north.");
			GameMap.setPlayerDestination(1,1);
			break;
		case "s":
			// System.out.println("You chose south.");
			break;
		case "e":
			// System.out.println("You chose east.");
			break;
		case "w":
			//System.out.println("You chose west.");
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
			//System.out.println("Player command executes now.");
			executePlayercommand();

		} else {
			System.out.println("I don't recognize that command.");
			System.out.println(""); // print blank line
			return;
		}
			
	} // close getPlayerCommand function
							
	
	
	// start main function
	public static void main(String[] args) {
		
	}
	
} // close class
 	
 
