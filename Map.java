
public class Map
{
    static int playerX;
    static int playerY;
    static int playerLeavingX;
    static int playerLeavingY;
    public static Location playerLocation;

    
    public static Location[][] arrayOfLocations = new Location[3][6];
    
    public static void setPlayerDestination(int x, int y) {
		playerX = x;
        playerY = y;
        playerLocation = arrayOfLocations[playerY][playerX];
        arrayOfLocations[playerY][playerX] = new Location("Player Location", "@", false); 
        arrayOfLocations[playerLeavingY][playerLeavingX] = playerLocation;
    }
    
    
	// getter (player coordinate x)
	public static int getPlayerCoordinateX() {
		return playerX;
	}
		 
	// getter (player coordinate y)
	public static int getPlayerCoordinateY() {
		return playerY;
	}	 
	
	// getter (player LEAVING coordinate x)
	public static int getPlayerLeavingCoordinateX() {
		return playerLeavingX;
	}
		 
	// getter (player LEAVING coordinate y)
	public static int getPlayerLeavingCoordinateY() {
		return playerLeavingY;
	}	 
    
    public static void build() {
        arrayOfLocations[0][0] = new Location("Location 1", "#", false);
        arrayOfLocations[0][1] = new Location("Location 2", ".", true);
        arrayOfLocations[0][2] = new Location("Location 3", ".", true);
        arrayOfLocations[0][3] = new Location("Location 4", ".", true);
        arrayOfLocations[0][4] = new Location("Location 5", ".", true);
        arrayOfLocations[0][5] = new Location("Location 6", "#", false);
        
        arrayOfLocations[1][0] = new Location("Location 7", "#", true);
        arrayOfLocations[1][1] = new Location("Location 8", ".", true);
        arrayOfLocations[1][2] = new Location("Location 9", ".", true);
        arrayOfLocations[1][3] = new Location("Location 10", ".", true);
        arrayOfLocations[1][4] = new Location("Location 11", ".", true);
        arrayOfLocations[1][5] = new Location("Location 12", "#", false);
        
        arrayOfLocations[2][0] = new Location("Location 13", "#", false);
        arrayOfLocations[2][1] = new Location("Location 14", ".", true);
        arrayOfLocations[2][2] = new Location("Location 15", ".", true);
        arrayOfLocations[2][3] = new Location("Location 16", ".", true);
        arrayOfLocations[2][4] = new Location("Location 17", ".", true);
        arrayOfLocations[2][5] = new Location("Location 18", "#", false);
      
    }
    
    public static void draw() {
		
		 System.out.print("\033\143"); // clears screen, Linux specific. Find better solution through libraries
		
         for (int i = 0; i < arrayOfLocations.length; i++) { // start outer loop
            for (int j = 0; j < arrayOfLocations[i].length; j++) { // start inner loop
                System.out.printf( arrayOfLocations[i][j].getIcon() + " ");
            } // end inner loop
            System.out.printf("\n"); // print line break between each inner array
        } // close outer loop
        
        //arrayOfLocations[playerY][playerX]
        
        System.out.printf("\n"); // print blank line
    }
        
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
    }
}
