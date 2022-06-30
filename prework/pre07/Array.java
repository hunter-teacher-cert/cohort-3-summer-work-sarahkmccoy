import java.io.*;
import java.util.*;

public class Array{
	public static void main(String[] args) {
	  //Calling powArray with a list of the numbers 1 to 4, using the power 3.
		double[] a = {1.0,2.0,3.0,4.0};
		double n = 3;
		System.out.println("Here is an array:");
		System.out.println(Arrays.toString(a));
		System.out.println("Here is that array raised to the power " + n);
		powArray(a,n);
		System.out.println(Arrays.toString(a));
		
		//Calling histogram with numcounters counters and array of numscounters random values up to numcounters. ie, if I have 50 counters, then I need to limit my randomArray to numbers up to 50.  Would like to come back to this and generalize more.
		int numcounters = 77;
		int[] class_scores = randomArray(numcounters);
		System.out.println("Here is an array of " + numcounters + " random scores between 0 and " + numcounters +":");
		System.out.println(Arrays.toString(class_scores));
		System.out.println("Here is a histogram of those scores, using " +numcounters+ " counters");
		System.out.println(Arrays.toString(histogram(class_scores, numcounters)));
	}
//powArray
	public static double[] powArray(double[] a, double n){
		for (int i = 0; i < a.length; i++) {
    	a[i] = Math.pow(a[i], n);
			}
			return a;
		}

//Create a random array of integers between 1 and and the size of the array
	public static int[] randomArray(int size){
		Random random = new Random();
		int[]a = new int[size];
		for (int i=0; i <a.length; i++) {
			a[i]=random.nextInt(size);
		}
			return a;
		}
//Histogram 
	public static int[] histogram(int[] scores,int counters){
		int[] counts = new int[counters];
		for (int score : scores){
    	counts[score]++;
		}
		return counts;
	}
}

