import java.io.*;
import java.util.*;


/**
 * Time class by Team LucidThinkeren
 * collaborators: Sarah McCoy, Rachel Kaufman, Steve Sabaugh, Tanya Wardally
 */

/**
   Basic level (complete all):
   + public Time(int hrs, int mins, int secs) - constructor
   + public void toString()
   + public void set(int hrs, int mins, int secs)

   Intermediate level (complete Basic methods plus this method):
   - public void add(Time other)
   - public boolean isEquals(Time other)

   
   Advanced level (complete Basic + Intermediate + these two methods):
   - public int compareTo(Time other)
   
*/



public class Time {
    // Instance Variable(s)
    // You can change this if you want to use the alternate
    // implementation of just storing the overall seconds.
    
    private int hours;
    private int minutes;
    private int seconds;

    // Constructors
    public Time(){
			hours = 0;
			minutes = 0;
			seconds = 0;
	
    }

    /**
       This over
     */
    public Time(int hrs, int mins, int secs){
    	
			hours = hrs;
    	minutes = mins;
  		seconds = secs;

    }
    
    
    // Methods

    /**
       returns a string representation of the time
    */
    public String toString(){
      String timeString = String.format("%02d:%02d:%02d",hours,minutes, seconds);
     //String timeString = hours + ":" + minutes + ":" + seconds;
      
	return timeString;//I changed this from "datestring".  So we don't really need to create a variable, doesn't increase clarity...?
    }
    /**
       Parameters:
       - hrs,mins,secs - ints representing a time

       modifies this instance to represent the time hrs:mins:secs
    */
    public void set(int hrs, int mins, int secs){
      //This allows us to overwrite an ALREADY created object that has been instantiated using either Time() or Time(h, m ,s)
			hours = hrs;
      minutes = mins;
    	seconds = secs;

    }

    /**
       Parameters:
       - other - a variable of type Time

       modifies this instance to represent the result of adding it and
       the time other.
    */
    public void add(Time other){
	// add the code to add the time represented by other
	// to this instance.
	//You could use this.hours to help distinguish, but not really necessary.
				hours+=other.hours;
				minutes+=other.minutes;
				seconds+=other.seconds;
//now adjust for over 60, done in opposite order.  Using in between variable because if I overwrite seconds, it messes up the next operation.  Not very elegant?
			
			//the remainder when divided by 60 is the # of seconds that haven't rolled into minutes	
				int seconds2 = seconds%60;
			//sec/60 takes the floor of the quotient, which gets rolled into minutes
				int minutes2 = minutes + seconds/60;
				int hours2 = hours + minutes/60;
//now reassign back to original
				hours = hours2;
				minutes = minutes2;
				seconds = seconds2;
    }


    /**
       Parameters:
       other - a variable of type Time

       Returns:
       True if this instance and other represents the same time
       false otherwise.
    */
    public boolean equals(Time other){
	    //if (other.equals(this.hours + ":" + this.minutes + ":" + this.seconds))        										  		
			if(other.equals(String.format("%02d:%02d:%02d", hours, minutes, seconds)))
		 		{
        return true;
     	 	}

				return false; 
   	}

    /**
       Parameters:
       other - a variable of type Time

       Returns:
       A positive number if this instance represents a time greater
       than the time of other (this > other)

       A negative number if this instance represents a time less
       than the time of other (this < other)

       0 if the two instances represent the same time.

    */
    public int compareTo(Time other){
	// your code here)

	return 0; // change this
    }
    

    
}//end class