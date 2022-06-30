import java.io.*;
import java.util.*;


public class Methods{
	public static void main(String[] args){
    System.out.println(isDivisible(15,4));
		System.out.println(isTriangle(3,4,8));
		System.out.println(Ack(3,3));
		}

  public static boolean isDivisible(int n, int m) {
			return(n % m == 0);
		}
        
	
	public static boolean isTriangle(int a, int b, int c) {
	//I debated using a long or statement
		if (a + b <= c) {
			return false;
		}else if (b + c <= a) {
			return false;
		}else if (a + c <= b) {
			return false;
		}else {
			return true;
		}
	}

 public static int Ack(int m, int n){
	 if (m == 0){
		 return n + 1;
	 	}else if (m > 0 && n ==0){
			return Ack(m - 1, 1);
		}else {
			return Ack(m-1, Ack(m, n-1));
		}
			
 }

}




