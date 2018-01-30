/**
 * 
 * Class name - NQueensProblem
 * Created on - 30/01/18
 * Reference no - Programming Fundamentals-4
 * 
 * version 1.0
 * @author Saloni Khandelwal
 *
 */
public class NQueensProblem {
	/**
	 * This is function to check if a queen can be placed on board[row][col] or not?
	 * This is checking only left side for attacking queens.
	 * @param board
	 * @param row
	 * @param col
	 * @param dimension
	 * @return true if queen can be safely placed and otherwise returns false.
	 */
	public boolean correctPlace(int board[][], int row, int col, int dimension){
		int i,j;
		//Check same row in left side.
		for(i = 0; i < col; i++){						
			if(board[row][i] == 1){
				return false;
			}
		}
		//Check Top left Diagonal in left side
		for(i = row, j = col; i >=0 && j >=0; i--, j--){
			if(board[i][j] == 1){
				return false;
			}
		}
		//Check Bottom left Diagonal in left side.
		for(i = row, j = col; j >=0 && i > dimension; i++, j--){
			if(board[i][j] == 1){
				return false;
			}
		}
		return true;
		
	}
	/**
	 * This function solves the N Queen problem using backtracking.
	 * @param board
	 * @param col
	 * @param dimension
	 * @return -returns false if Queens can not be placed otherwise returns true
	 */
	public boolean boardSolver(int board[][], int col, int dimension){
		if(col >= dimension){				//if all queens are placed return true.
			return true;
		}
		//Try all rows in the same column to place the queen.
		for(int i = 0; i < dimension; i++){
			if(correctPlace(board, i, col, dimension)){
				//Place this Queen in board[i][col].
				board[i][col] = 1;
				
				//Try to place rest of the queens.
				if(boardSolver(board, col+1, dimension)){
					return true;
				}
				//if placing of Queen in board[i][col] is not correct, remove the Queen from board[i][col].
				board[i][col] = 0;
			}
		}
		
		return false;
	}
}
