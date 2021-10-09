
public class Main {
	
	public static void main (String[] args) {
		
		GameMap map = new GameMap(0,0); // create new instance of GameMap
        
        /*
        map.drawMap();
        map.setPlayerLocation(2,2);     
        map.playerPresent = true;
        map.drawMap();
        */
        
        UI ui = new UI();
        ui.getPlayerCommand();
        
	}
}

