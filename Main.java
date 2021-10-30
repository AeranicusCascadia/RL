// TODO
// Store, recall, and draw player former location when player moves
// fix out of bounds error with player movement

public class Main {
	
	static boolean gameRunning = true;
	
	public static void main (String[] args) {
	
		UI ui = new UI();
		Map.build();
		Map.setPlayerDestination(1,1);
		
		Map.arrayOfLocations[0][0] = new Location("Location 1", "#", false); // probably a bad solution

		Map.draw();
		
		while (gameRunning) { // start main game loop
			ui.getPlayerCommand();
			Map.draw();
			System.out.println("\n" +  UI.getPostCommandMessage() + "\n");
			
			// feedback for movement troubleshooting
			System.out.println( "Destination X: " + Map.playerX + " Y: " +  Map.playerY );
			System.out.println( "Leaving X: " + Map.playerLeavingX + " Y: " +  Map.playerLeavingY );
			System.out.println( Map.playerLocation );
			
			} // close main game loop
			
		System.out.println("You exit the game."); // exit message
		System.out.println("");
	
	} // close main method
} // close Main class

