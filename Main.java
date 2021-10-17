
public class Main {
	
	static boolean gameRunning = true;
	
	public static void main (String[] args) {
		
		GameMap map = new GameMap(0,0); // create new instance of GameMap
       
        UI ui = new UI();
        
        map.setPlayerDestination(3, 3);
		map.drawMap();
        
        while (gameRunning) {	
			ui.getPlayerCommand(); 
			map.drawMap();
			System.out.println("\n" +  UI.getPostCommandMessage() + "\n");
		} // close game loop
		
		System.out.println("You exit the game."); // exit message
		System.out.println("");
        
	} // close Main function
} // close class

