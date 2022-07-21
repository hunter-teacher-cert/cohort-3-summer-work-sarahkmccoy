import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Part 1
	
	SortSearch ss = new SortSearch(10); // TODO: set this to 20
	System.out.println("New Array: \n" + ss);
		
	// Part 2

	 int i;
	 i = ss.findSmallestIndex(0);
	 System.out.println("Starting my search at 0");
	 System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
   System.out.println("Starting my search at 3");
	 i = ss.findSmallestIndex(3);
	 System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);

    // Test for invalid index
    System.out.println("Starting my search at 10"); // TODO: set this to 20
	  i = ss.findSmallestIndex(10);
    System.out.println("Starting my search at -2");
	  i = ss.findSmallestIndex(10);
	
	// Part 3
  
  	System.out.println(ss);
  	ss.sort();
    System.out.println("Sorted array:");
  	System.out.println(ss);

//we added a constructor to make a static sorted array, since it was annoying to have a bunch of random arrays 
    SortSearch searchArray = new SortSearch();

    //searchArray = ss; // TODO:remove this line after test
    searchArray.sort();
    
		System.out.println("Array used by search methods:");
  	System.out.println(searchArray);
      
    // Test linearSearch
    System.out.println("Element 5 is located at index (linearSearch): " + searchArray.linearSearch(5));
      
    // Test binarySearch

    System.out.println("Element 2 is located at index (binarySearch): " + searchArray.binarySearch(2));

    System.out.println("Element 10 is located at index (binarySearch): " + searchArray.binarySearch(10));
      
    System.out.println("Element 5 is located at index (binarySearch): " + searchArray.binarySearch(5));

    System.out.println("Element 0 is located at index (binarySearch): " + searchArray.binarySearch(0));

    System.out.println("Element 9 is located at index (binarySearch): " + searchArray.binarySearch(9));

    System.out.println("Element 11 is located at index (binarySearch): " + searchArray.binarySearch(11));
 System.out.println();
      // Test recursive method
      System.out.println("Element 5 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(5, 0, 10));
      System.out.println("Element 0 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(0, 0, 10));
      System.out.println("Element 10 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(10, 0, 10));
      System.out.println("Element 9 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(9, 0, 10));
      System.out.println("Element 15 is located at index (binarySearchR): " + searchArray.binarySearchRecursive(15, 0, 10));
      
    }
}