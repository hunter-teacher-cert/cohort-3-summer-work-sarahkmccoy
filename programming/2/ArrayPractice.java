/**
 * ArrayPractice by Team BossCoders
 * collaborators: Sarah McCoy, Rachel Kaufman, Stacy Goldstein, Jenna Lin
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


//prints a 1D array of any size
  public static void printArray( int[] data )
  {
    System.out.print("Array: { ");
     for (int i = 0; i < data.length; i++) {
      System.out.print(data[i] + " ");
    }
    System.out.println("}");
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


//sums up an array of any size
  public static int arraySum( int[] data )
  {
    int sum=0;
         
    for (int datum:data) {
      sum += datum;
    }

    return sum; // replace this
  }


// determines if the array is sorted in increasing order
  public static boolean isSorted(int[] data)
  {
    // put length-1 to avoid out of bounds error
    for (int i = 0; i < data.length - 1; i++) {
      if (data[i] > data[i+1]) {
        return false;
      }
    }

    return true; 

  }

// finds and returns the max value in an array of any size
	public static int findMaxValue( int[] data ) {
    int maxVal=data[0];  // holds current max value, initialize to first value in array.

    for (int datum : data) {
			//Compare each value to the current maxVal
       if (datum > maxVal) {
       maxVal = datum;
		}
  } 

    return maxVal;
  }

// counts and returns the number of odds in a given array
  public static int countOdds( int[] data ) {
    int count=0;

    /* YOUR BRILLIANT CODE HERE */
     for (int i = 0; i < data.length; i++) {
       if(data[i]%2 !=0)
         count++;
     }

    return count;
  }

// put an array down flip it and reverse it
  public static void flip(int[] data )
  {
    int[] tempData = new int[data.length];

    // copy original array into temporary array
    for(int i=0; i < data.length; i++) {
      tempData[i] = data[i];
    }

    //reset the original array in the reverse order
    for(int i=0; i < data.length; i++) {
      data[i] = tempData[(data.length-1) - i];
    }
    
  }

// originalarray = {A, B, C, D}
// temparray = {A, B, C, D}

  // i    [(data.length-1)]    [(data.length-1)] - i  RESULT (state of original)
  // 0     3                   3											D, B, C, D
  // 1     3                   2											D, C, C, D
  // 2     3                   1											D, C, B, D
  // 3     3                   0											D, C, B, A

// originalarray = {D, C, B, A}

  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

     // int[] data1 = buildRandomArray(6, 10);
    int[] data2 = buildIncreasingArray(10,6,2);
     printArray(data2);
    // printArray(data2);

    System.out.println("First occurence of value: " + firstOccurence(data2, 12));
    
    System.out.println("Max Value: " + findMaxValue(data2));

    System.out.println("Sum of array values: " + arraySum(data2));

    System.out.println("Is it sorted? " + isSorted(data2));
    System.out.println("Number of odd numbers in array: "+ countOdds(data2));

    //not a return function so can't call it as a parameter
    //here we use flip to reorder the array (overwrite it)
    flip(data2);

    //print the revised array
		System.out.print("Flipped ");
    printArray(data2);

  }
}