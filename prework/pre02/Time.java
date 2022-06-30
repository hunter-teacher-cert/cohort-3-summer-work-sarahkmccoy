import java.io.*;
import java.util.*;

public class Time{
    public static void main(String[] args){
        System.out.println("Hello world!");
			//using double
				double  hour = 10.0;
				double  minute = 48.0;
				double second = 45.0;
				double sincemidnight = hour*3600 + minute*60 + second;
				double secondsleft = 24*3600 - sincemidnight;
				System.out.println("It has been " + sincemidnight + " seconds since midnight.");
				System.out.println("There are " + secondsleft + " seconds left in the day.");
				double percentdone = sincemidnight/(24*3600)*100;
				System.out.println("So, " + percentdone + "% of the day has passed.");

				//using int...It suprised me that placing the *100 next to the sincemidnight formula dealt with the int rounding error, while placing at the end of the expression did not.  I think I get it though.
				int hour2 = 10;
				int minute2 = 48;
				int second2= 45;
				int sincemidnight2 = hour2*3600 + minute2*60 + second2;
				int secondsleft2 = 24*3600 - sincemidnight2;
				System.out.println("It has been " + sincemidnight2 + " seconds since midnight.");
				System.out.println("There are " + secondsleft2 + " seconds left in the day.");
				int percentdone2 = sincemidnight2*100/(24*3600);
				System.out.println("So, about " + percentdone2 + "% of the day has passed.");
    }
}
    