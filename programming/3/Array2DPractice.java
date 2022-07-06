import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Sarah McCoy
 * collaborators:  JiHae Park, Adam Prado, Kirk Martin
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */

	// //prints a 1D array of any size
 //  public static void printArray( int[] data )
 //  {
 //    System.out.print("Array: { ");
 //     for (int i = 0; i < data.length; i++) {
 //      System.out.print(data[i] + " ");
 //    }
 //    System.out.println("}");
 //  }

  public static void printBoard( char[][] board )
  {
    //The definition of rows and cols is not necessary but improves readibility (vs. putting board.length and board[0].length in the for i loop)
		int rows = board.length;
		int cols = board[0].length;
		//The length of the 2D array is the number of rows in that array (number of sublists)
		for (int i = 0; i < rows; i++) {
			//The number of columns in the array is the same as the length of one of the rows, so just use the first one.
      for (int j = 0; j < cols; j++) {
        System.out.print(board[i][j] + " ");
      }
				System.out.println();
  	}
	}

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
		//iterate through the length of the row you are overwriting.  You could also used board[0].length, but I suppose this is more generalized (in case of jagged array)].  As in printBoard, I could have defined col as board[row].length first
   for (int i=0; i < board[row].length; i++)
		 //overwrite each element in that row
		 board[row][i] = value;
  }

  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    char[][] newBoard = new char[original.length][original[0].length];
    
    for (int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        newBoard[i][j]=original[i][j];
      }
    }
    return newBoard;
  }


  // public static void explodeSquare( char[][] board, int row, int col )
  // {
  //   /VERSION 1
  //   // below are the positions of all neighboring cells
  //   // board[row-1][col-1]='X';  //up left
  //   // board[row-1][col]='X';    //up center
  //   // board[row-1][col+1]='X';  //up right
  //   // board[row][col-1]='X';       //mid left
  //   // board[row][col+1]='X';       //mid right
  //   // board[row+1][col-1]='X';    //bottom left
  //   // board[row+1][col]='X';      //bottom center
  //   // board[row+1][col+1]='X';    //bottom right

  //   if(col>0){  //checks if left most column 
  //     board[row][col-1]='X';  
  //   }
  //   if(col<board[0].length-1){
  //     board[row][col+1]='X';
  //   }
  //   if(row>0){   //check if not on top row
  //     board[row-1][col]='X';
  //      if(col>0){//checks if left most column 
  //        board[row-1][col-1]='X';
  //     }
  //     if(col<board[0].length-1){
  //       board[row-1][col+1]='X';
  //     }  
  //   }
  //   if(row<board.length-1){  //check if not on bottom row
  //      if(col>0){//checks if left most column 
  //        board[row+1][col-1]='X';
  //      }
  //     board[row+1][col]='X';
  //     if(col<board[0].length-1){
  //       board[row+1][col+1]='X';  
  //     }
  //   }
  // }
//VERSION 2: TRYING DIFFERENT METHOD HERE--iterate through the items around the given one, and check if they are an edge.  If not edge, explode.

	public static void explodeSquare( char[][] board, int row, int col )
  {
     for (int i = row-1; i < row+2; i++) {
      for (int j = col-1; j < col+2; j++) {
        if(i > -1 && 
						i < board.length && 
						!(row==i && col==j) &&
						j > -1 &&
						j<board[0].length){
				
          board[i][j]='x';
          
        }
      }
     }
  }
  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
		//Defining number of rows and columns in terms of length functions.  This will need more testing because adjacent instances of the target cause problems
    int rows = board.length;
		int cols = board[0].length;
		
		for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
				//Note that the parameter c is not in single quotes
				if (board[i][j]== c){
					explodeSquare(board, i, j);
				}
			}
  	}
	}


 // LIFTED FROM RACHEL KAUFMAN.  downString will insert the parameter word into board at the given position in a downward direction.
public static void downString( char[][] board, int row, int col, String word )
  {
    for (int i=row; i<board.length; i++){
      if (i-row < word.length()) {
        board[i][col] = word.charAt(i-row);
      } else {
        break;
      }
    }
  }

public static void main( String[] args )
  {
    System.out.println("creates a board 5 rows, 10 columns, all z");
    char[][] b = buildBoard(5,10,'z');
    printBoard(b);
		//replace 3rd row with "@"
    setRow(b,2,'@');
    System.out.println();
    printBoard(b);
    
    System.out.println();
		//copy board and print
    char[][] arrCopy = copyBoard(b);
    printBoard(arrCopy);
    System.out.println();
   
		//explode tests
		System.out.println("This will explode the board at position 2,4 with x's");
		//re-initializing a board to zs
		char[][] a = buildBoard(5,10,'z');
    explodeSquare(a,2,4);
    printBoard(a);

		System.out.println();
    System.out.println("This will explode the board at position 0,4 with x's");
		//re-initializing a board to zs
		char[][] c = buildBoard(5,10,'z');
    explodeSquare(c,0,4);
    printBoard(c);

		System.out.println();
		
		System.out.println("This will explode the board at position 0,0 with x's");
		char[][] d = buildBoard(5,10,'z');
    explodeSquare(d,0,0);
		printBoard(d);

		System.out.println();
		
		System.out.println("This will explode the board at position 4,9 with x's");
		//re-initializing a board to zs
		char[][] e = buildBoard(5,10,'z');
    explodeSquare(e,4,9);
    printBoard(e);

		System.out.println();

		
		//re-initializing a board to zs
		System.out.println("This will explode all instances of $");
		char[][] f = buildBoard(5,10,'z');
    //Assigning some elements to the character '$'' :
		f[2][2]='$';
		f[4][8]='$';
		explodeAllChar(f,'$');
    printBoard(f);

		
		//Assigning some elements to the letter c:
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}


