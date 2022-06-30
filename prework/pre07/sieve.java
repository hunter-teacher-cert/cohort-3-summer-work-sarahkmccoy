import java.io.*;
import java.util.*;

public class sieve{
	public static void main(String[] args) {
		//An array with a non-repeated max value.
		int a;
		System.out.println("Here is an array starting at zero, going up to a parameter, n:");
		System.out.println(Arrays.toString(makelist(20)));
		
		System.out.println("Here is which of those numbers are prime");
		System.out.println(Arrays.toString(sieve(20)));
		
	}
//populate an array with the numbers 0 to n
	public static int[] makelist(int n){
		
		int[]a = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i]=i;
		}		
		return a;
	}
	
	public static boolean[] sieve(int n) 
    {   boolean[] r = new boolean[n];
				r[0]=false;  //0 and 1 are neither prime nor comp.
				r[1]=false;
        for (int i=2; i <r .length; i++) 
        {
            r[i]=true;//first set everything to true
        }
			//start at 2.  Run the sieve until you reach the square root of n (because after that you're just finding the commutative factor pairs, like 3*7 vs. 7*3)
        for (int i=2; i < Math.sqrt(n); i++)
        {
             if(r[i]==true)//If it's currently marked as prime
             {
                for(int j=(i*i); j<n; j=j+i) //Find the multiples of that value
                {
                   r[j]=false;//set the multiples to composite
                }
             }
        }
        return r;
    }


		}
	
