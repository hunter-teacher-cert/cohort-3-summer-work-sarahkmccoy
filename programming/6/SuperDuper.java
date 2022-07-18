/**
 * SuperArray by Team MarvelvsDC
 * Michael Randazzo
 * collaborators: Alise Braick, Tanya Wardally, Sarah McCoy
 */
//THIS HAS SOME EXTRA ABILITIES IN ADD AT INDEX
/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;


public class SuperDuper
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray(int size)
  {
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements = 0; 
    data = new int[size];
    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */
    numberElements = 0;
    data = new int[10];
    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
	//this method appends a value after the last "real" element
  {
    if(data.length == numberElements){
      grow();
    }
   
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */
    data[numberElements] = value;

    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */
    numberElements++;
    //data[numberElements++] = value;     increments as well
  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
		//Reminder that a boolean asks a question and returns true or false, so you do not need if/else--that's built in.  When we write "numberElements==0" we are asking "Is the number of elements 0?  The answer is returned.
    return numberElements == 0;
      
  }


  public int get(int index)
  {
    //return item at index
   
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
    String dataS = "";
    if (numberElements !=0){
      dataS= "{ "+ data[0];
      for( int i = 1; i< numberElements; i++){
     dataS = dataS + ", " + data[i]; 
    }
    dataS = dataS + "}";
    }
		//go through the number of "real elements", not data.length
    
    
    return dataS;
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    for (int i = index; i<numberElements; i++ ){
      data[i]= data[i+1];
    }
  // subtract fom numElements;
    numberElements--;
  }


  public void add(int index, int value)
	//inserts an element at a given index
  {
    // see if there's enough room
    while ( index > data.length){
       grow();
    }
    if(index > numberElements){
      data[index] = value;
      numberElements = index;
    }
    
    if( numberElements == data.length){
     grow(); 
   }
    // shift elements toward the end of the array
    else{
      for(int i= numberElements-1; i>= index; i--){
      data[i+1] = data[i];
      
    }

    // insert new element
    data[index]= value;

    // increment numElements
    numberElements++;
    }
    //data[numberElements++] = value;     increments as well
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    int updatedData[] = new int[data.length+5];

    // copy over all the elements from the old array to the new one
    for (int i = 0; i <data.length; i++){
      updatedData[i] = data[i];
    }
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
  data = updatedData;
  }//end grow()

  //grow with size parameter
  private void grow(int size)
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    int updatedData[] = new int[data.length+ size];

    // copy over all the elements from the old array to the new one
    for (int i = 0; i <data.length; i++){
      updatedData[i] = data[i];
    }
    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
  data = updatedData;
  }//end grow()

}//end class