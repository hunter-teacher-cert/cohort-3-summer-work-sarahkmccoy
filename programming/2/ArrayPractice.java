/**
 * ArrayPractice by Team BossCoders
 * McCoy, Sarah
 * collaborators: Sarah McCoy, Rachel Kaufman, Stacy Goldstein, Jenna Lin
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:

   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   + buildRandomArray
   + printArray
   + arraySum
   + firstOccurence
   - findMaxValue

   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds

   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  //builds an array of a given size with a start value and increment value
  public static int[] buildIncreasingArray(int size, int startValue, int step)
  {
    int[] data = new int[size];

    // loop through each element of the array and assign the appropriate value to each one
    for (int i = 0; i < size; i++){
      data[i] = startValue + (step * i);
    }

    return data;
  }

// builds an array of random numbers of a given size
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    for (int i = 0; i < size; i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


//prints any array of any size
  public static void printArray( int[] data )
  {
     for (int i = 0; i < data.length; i++) {
      System.out.println(data[i]);
    }
  }



//returns the index of the first occurence of a requested value in an array
  public static int firstOccurence( int[] data, int value )
  {
    int valPos = 0;
    while (data[valPos] != value) {
      valPos++;
      
      if(valPos == data.length) {
        return -1;
      }
    }

    return valPos; 
  }


// sums up an array of any size
  // public static int arraySum( int[] data )
  // {
  //   int sum=0;
         
  //   for (int i = 0; i < data.length; i++) {
  //     sum += data[i];
  //   }

  //   return sum; // replace this
  // }


  /**
     Parameters:
     data - an array of integers

     Returns:
     true if the array is sorted, false otherwise

     That is, if each element is < the element to its right
     then the array is sorted.

     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,13,15 is not

  */
  // public static boolean isSorted(int[] data)
  // {
  //   for (int i = 0; i < data.length; i++) {
  //     if (data[i]>data[i+1]) {
  //       return false;
  //     }
  //   }

  //   return true; 

  // }

// finds and returns the max value in an array of any size
  public static int findMaxValue( int[] data ) {
    int maxVal=data[0];  // holds max value, initialize to the first value in array.

    for (int i = 0; i < data.length - 1; i++) {
      if (data[i+1]>maxVal) {//Compare next value to the current value
       maxVal = data[i+1];
		}
  } 

    return maxVal;
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     the number of odd elements in the array

     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  // public static int countOdds( int[] data ) {
  //   int count=0;

  //   /* YOUR BRILLIANT CODE HERE */
  //    for (int i = 0; i < data.length; i++) {
  //      if(data[i]%2 !=0)
  //        count++;
  //    }

  //   return count;
  // }

  /**
     Parameters:
     data - an array of integers

     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter

     Postcondition:
     elements of the input array are in reverse order

     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  // public static void flip( int[] data )
  // {
  //   /* YOUR BRILLIANT CODE HERE */
  // }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

     int[] data1 = buildRandomArray(15, 100);
    // int[] data2 = buildIncreasingArray(10,5,3);
     printArray(data1);
    // printArray(data2);

    System.out.println("Max Value: " + findMaxValue(data1));


    // add calls to show that the methods you write work.
  }
}