package solver;
public class Sudoku {

	private int[][] board; // main board
	private int size = 9;
	
	// Constructor
	public Sudoku(int[][] board) {
		
		// validate the size of the board. Maybe throw an exception if the size is incorrect.
		
		this.board = board;
	}
	
	public boolean validateBoardSize() {
		// ...
		return true;
	}
	

	// We would need a method to solve the sudoku
	
	// And a method to check if a filled-in sudoku is correct
	
	/* Maybe we can have a method to generate a random puzzle for the user to solve. 
	   The method could generate a possible puzzle and pass the int[][] to the constructor.
	   Or maybe we can overload the constructor with a no arg constructor that generates
	   one.
	*/	
	
	// and maybe a method for the user to check if a single square is correct
	
	// and maybe an option for the user to reveal a certain square
	
	// maybe a method to reveal a random square
	

}
