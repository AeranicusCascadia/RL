// TODO populate map with objects and nulls. ASCII are place holders, but will still be displayed as properties


public class GameMap
{
    // properties
    String mapName;
    boolean playerPresent;
    
    static int playerY;
    static int playerX;
    
    int leavingPlayerY;
    int leavingPlayerX;
    
    String[][] mapGrid = {
            {".", ".", "."},
            {".", ".","."},
            {".", ".","."}
        };
    
 // setter (player destination)
 public static void setPlayerDestination(int x, int y) {
	 
	 
	 playerX = x;
	 playerY = y;
	 }
 
 
    
    // draw map function
    public void drawMap() {
		
        
        System.out.print("\033\143"); // clears screen, Linux specific. Find better solution through libraries

        if (playerPresent) { 
			this.mapGrid[playerY][playerX] = "*";
		}
        
       for (int i=0; i < this.mapGrid.length; i++) { // outer array
        
            for (int j=0; j < this.mapGrid[i].length; j++) { // inner array
                System.out.printf( this.mapGrid[i][j] + " " );
            } // close inner array
            
            System.out.printf("\n"); // line break between map rows
        } // close outer array
        
        System.out.println(""); // Add two blank lines
                
    } // close function
     
    
    
    // setter: player location
    public void movePlayer(int x, int y) {
		
		
		
		playerX = x;
		playerY = y;
		}
    
    // constructor
    public GameMap(int x, int y) {
		
		playerX = x;
		playerY = y;
		
        mapName = "generic map";
    }
    
    // main loop
    public static void main(String[] args) {
        
    }
}
