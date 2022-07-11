/**
 * SuperArray by Team MarvelvsDC
 * Michael Randazzo
 * collaborators: Alise Braick, Tanya Wardally, Sarah McCoy
 */

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


public class SuperArray
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
  public SuperArray( int size )
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
  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
    if( numberElements == 0){
      return true;
    }
    return false;
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
    String dataS= "";
		//go through the number of "real elements", not data.length
    for( int i = 0; i< numberElements; i++){
     dataS = dataS + data[i] + " "; 
    }
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
   if( numberElements == data.length){
     grow(); 
   }
    // shift elements toward the end of the array
    for(int i= numberElements-1; i>= index; i--){
      data[i+1] = data[i];
      
    }

    // insert new element
    data[index]= value;

    // increment numElements
    numberElements++;
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

}//end class