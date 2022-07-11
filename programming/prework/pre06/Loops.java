import java.io.*;
import java.util.*;

public class Loops{
	public static void main(String[] args) {
	    //Call the methods defined below
			System.out.println(squareRoot(169));
			System.out.println(power(2.3,5));
			System.out.println(factorial(5));
	}
		
  //7.9 #2
  public static double squareRoot(double a) {
		double guess1 = a/2;
		double guess2 =(guess1 + a/guess1)/2;

	 	while (Math.abs(guess1 - guess2) >= 0.0001){
		 guess1 = guess2;
		 guess2 = (guess1 + a/guess1)/2;
		}
		return guess2;
	}
	//7.9 #3
	public static double power(double x, int n) {
		double factor = x;
		for (int i = 1; i < n; i++){
			x = x* factor;
		}
	 return x;
	
	}
	//7.9 #4
	public static int factorial(int n){
		
	  for (int i = n-1; i >1; i--){
			n = n*i;
		}
		return n;
	}
}

