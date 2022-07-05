import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * First Last
 * collaborators: Sarah McCo, JiHae Park, Adam Prado, Kirk Martin
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
    /* YOUR AWESOME CODE HERE */
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  // public static void explodeSquare( char[][] board, int row, int col )
  // {
  //   /* YOUR AWESOME CODE HERE */
  // }

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
  // public static void explodeAllChar(char[][] board, char c)
  // {
  //   /* YOUR AWESOME CODE HERE */
  // }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  // public static void downString( char[][] board, int row, int col, String word )
  // {
  //   /* YOUR AWESOME CODE HERE */
  // }


	public static void main(String[] args)
  {
    //Build a 5 x 10 2D array of characters (char) called b, populated with z's.
		char[][] b = buildBoard(5,10,'z');
		printBoard(b);
		setRow(b,1,'k');
		System.out.println();
		printBoard(b);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}


