import java.util.Scanner;
import java.io.*;

public class UI {
	
	// properties
	String playerCommand;
	String validPlayerCommands[] = {"n", "s", "e", "w"};
	
	// constructor
	public UI() {}
	
	// test player input
	public void testPlayerInput() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.printf("Please enter some text and press return: ");
		playerCommand = input.nextLine(); 
		playerCommand = playerCommand.toLowerCase();
		
		
		// check in player command is in array of valid commands
		boolean isCommandValid = false;
		
		for (String command : validPlayerCommands) {
			if (playerCommand.equals(command) ) {
				isCommandValid = true;
				}
			}
			
		System.out.println(isCommandValid);
			
		}
	
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
			
		System.out.println(isCommandValid);
			
		}
		
		
	
	// start main function
	public static void main (String[] args) {
		
	}
}
