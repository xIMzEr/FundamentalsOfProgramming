import java.util.Arrays;

public class Main {
	 //Variables
	//Two integers to determine the number of columns and rows
	static int Rows = 6; 
	static int Colums = 10;
	 //Initialise the invisible array (arrayBSI) and the visible array
	//The invisible array is not shown to the user but is used to store where the battleships are placed
	static String[][] arrayBSI = new String[Rows][Colums];
	static String[][] arrayBSV = new String[Rows][Colums];
	
	public static void main(String[] args){
		//Populates both grids with blank spaces
		clearGrid();

		
		//Place a battleship in 1,0 and 5,9
		arrayBSI[1][0] = "x";
		arrayBSI[5][9] = "x";
		
		//Draw the visible Grid
		Draw();
		
		//Strike the battleships grid at 1,0 and print out a response
		String hit = hit(1, 0);
		System.out.println(hit);
		Draw();
	}
	
	
	//Method to dynamically draw the visible battleships grid
	public static void Draw() {
		
		for (int i = 0; i < Rows; i++) {
			for(int k = 0; k < (Colums - 1); k ++) {System.out.print("-----");}
			System.out.println("");
			System.out.print(i);
			for (int j = 0; j < Colums; j++) {
				System.out.print("| " + arrayBSV[i][j] + " ");
			}
			System.out.print("|");
			System.out.println("");
		}
		for(int k = 0; k < (Colums - 1); k ++) {System.out.print("-----");}
		System.out.println("");
	}
	
	
	//Scans the area specified by the user to see if a battleship exists, if so return that it has been hit and populate that area with a Y
	public static String hit(int hRow, int hColum) {
		String isHit = "No battleship was hit in your postition";
		clearConsole();
		if (arrayBSI[hRow][hColum] == "x") {
			isHit = "The Battleship was hit in [" + hRow + "," + hColum +"]";
			arrayBSV[hRow][hColum] = "y"; 
			arrayBSV[hRow][hColum] = "y";
		}
		
		return isHit;
	}
	
	//Outputs multiple blank lines to 'clear' the console
	public final static void clearConsole()
	{
		for (int i = 0; i < 50; ++i) System.out.println();
	}
	
	//Method that clears the grids by inserting blank spaces in the grid
	public static void clearGrid() {
		for(int i = 0; i < Rows; i++) {
			for (int j = 0; j < Colums; j++) {
				arrayBSI[i][j] = " ";
				arrayBSV[i][j] = " ";
			}
		}
	}
}
