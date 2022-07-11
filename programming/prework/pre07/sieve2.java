import java.io.*;
import java.util.*;

//This is not Erastothenes sieve, it's just a classic divisibility checker, but I wanted to practice more.  Also, I had to look up how to check for multiples in the other sieve file, so I needed to prove to myself that I could do a version on my own.

public class sieve2{
	public static void main(String[] args) {
		//An array with a non-repeated max value.
		int a;
		System.out.println("Is 50 prime? ");
		System.out.println(isPrime(50));
		System.out.println("Is 53 prime? ");
		System.out.println(isPrime(53));
		System.out.println("Here is an array starting at zero, going up to a parameter, n:");
		System.out.println(Arrays.toString(makelist(20)));
		System.out.println("Here is an array showing which of those are prime");
		System.out.println(Arrays.toString(sieve2(20)));

	}
//populate an array with the numbers 0 to n
	public static int[] makelist(int n){
		
		int[]a = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i]=i;
		}		
		return a;
		}
	
	//Check if an individual number is prime
	public static boolean isPrime(int n){
		
		for (int i=2; i <= Math.sqrt(n); i++) {
			if (n % i == 0){
				return false;
				}					
		}
		return true;
		
	}	
				
	public static boolean[] sieve2(int n) {  
		boolean[]r = new boolean[n];
		
				r[0]=false;  //0 and 1 are neither prime nor comp.
				r[1]=false;
        for (int i=2; i <r .length; i++) 
        {
            r[i]=true;//first set everything to true
        }
			for (int j=2; j < n; j++) //r.length= n
        	{
            if (!isPrime(j)){
							r[j]=false;
						}
					}
			return r;
	}
}
