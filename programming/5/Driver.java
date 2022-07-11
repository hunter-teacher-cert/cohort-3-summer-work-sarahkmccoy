import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
			Time t1, t2, t3;

	//assign var the address of a newly-apportioned Time object
 		 	t1 = new Time(); ///NEW OBJECT, T1, created and initialized to the default of 0 0 0  (created = "instansiated")
  		System.out.println("T1: " + t1.toString()); //calling toString from within the print statement...at first we created a variable to store it, but that's not necessary.  Apparently Java has a built in toString function so we didn't REALLY need it, but we wrote one to aid understanding
      
			t2 = new Time(4,30,44);//NEW OBJECT, T2, created and initialized to 4, 30, 44
  		System.out.println("T2: " + t2.toString());

 			t3 = new Time();//NEW OBJECT...0 0 0
      System.out.println("T3: " + t3.toString());
      
  		t3.set(2, 3, 4);//CHANGING THE ALREADY CREATED OBJECT, T3
      System.out.println("T3: " + t3.toString()); 
    }//end main()

}//end class