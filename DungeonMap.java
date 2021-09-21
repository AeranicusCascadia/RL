

public class DungeonMap {
	
	// properties
	String mapName;
	String[][] matrix = {
			{"empty", "empty", "empty"},
			{"empty", "empty", "empty"},
			{"empty", "empty", "empty"}
		};
	
	//constructor
	public DungeonMap(String name) {
		this.mapName = name;
		}
		
	// map name getter
	public String nameGetter() {
		return this.mapName;
		}
	
	// draw map - iterate through MD array
	public void drawMap() {
		
		System.out.printf("\n"); // print blank line
		
		for (int i = 0; i < matrix.length; i++) { // start outer loop
			
			for (int j = 0; j < matrix[i].length; j++) { // start inner loop
				System.out.println(matrix[i][j]);
				} // close inner loop
			} // close outer loop
		} // close drapMap method
		
		
	// start main method
	public static void main (String[] args) { 
		
		DungeonMap map = new DungeonMap("Default Prototype Map");
		
		map.drawMap();
		
	} // close main method
}





// early static prototyping

	/*
	static String[] matrix = {"empty", "empty", "empty"};
	
	public static void drawMap() {
		for (String i : matrix) {
			System.out.printf(i + " ");
			}
		System.out.printf("\n");			
		}
		
	*/	
