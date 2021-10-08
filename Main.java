
public class Main {
	
	public static void main (String[] args) {
		
		GameMap myMap = new GameMap(0,0); // create new instance of GameMap
        
        myMap.drawMap();
        
        myMap.setPlayerLocation(2,2);
        
        System.out.printf("\n");
        
        myMap.drawMap();
        
	}
}

