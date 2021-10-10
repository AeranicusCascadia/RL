
public class Main {
	
	public static void main (String[] args) {
		
		GameMap map = new GameMap(0,0); // create new instance of GameMap
       
        UI ui = new UI();
        
        map.playerPresent = true;
        map.setPlayerLocation(1, 1);
        map.drawMap();
        
        ui.getPlayerCommand();
        //map.drawMap();
        
	}
}

