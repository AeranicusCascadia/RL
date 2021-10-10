
public class Main {
	
	public static void main (String[] args) {
		
		GameMap map = new GameMap(0,0); // create new instance of GameMap
       
        UI ui = new UI();
        
        map.playerPresent = true;
        map.movePlayer(1, 2);
        map.drawMap();
        
        ui.getPlayerCommand();
        map.drawMap();
        
	}
}

