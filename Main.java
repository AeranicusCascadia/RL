// TODO
// Store, recall, and draw player former location when player moves
// fix out of bounds error with player movement

public class Main {
	
	static boolean gameRunning = true;
	
	public static void main (String[] args) {
	
		UI ui = new UI();
		Map.build();
		Map.setPlayerDestination(1,2);
		Map.draw();
		
		while (gameRunning) { // start main game loop
			ui.getPlayerCommand();
			Map.draw();
			System.out.println("\n" +  UI.getPostCommandMessage() + "\n");
			
			System.out.println( "Leaving X: " + Map.playerLeavingX + " Y: " +  Map.playerLeavingY );
			} // close main game loop
			
		System.out.println("You exit the game."); // exit message
		System.out.println("");
	
	} // close main method
} // close Main class

