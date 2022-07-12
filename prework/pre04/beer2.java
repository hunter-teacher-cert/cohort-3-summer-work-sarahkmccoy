import java.io.*;
import java.util.*;

public class beer2{
    public static void main(String[] args){
        System.out.println("Here's the song:");
				countdown(99);
				
    }
		public static void countdown(int n) {
    //Trying recursion with while...DOESN"T WORK
			while (n > 1) {
				System.out.println(n + " bottles of beer on the wall,");
				System.out.println(n + " bottles of beer!");
				System.out.println( "Ya' take one down, ya pass it around,");
				System.out.println(n - 1 + " bottles of beer on the wall!");
				System.out.println();
				countdown(n - 1);
			}
		//This is in here to fix the grammar of "1 bottles of beer on the wall"
		System.out.println(n + " bottle of beer on the wall,");
		System.out.println(n + " bottle of beer!");
		System.out.println( "Ya' take it down, ya pass it around,");
		System.out.println(n - 1 + " bottles of beer on the wall!");
		System.out.println();
				
    System.out.println("No bottles of beer on the wall,");
		System.out.println("No bottles of beer!");
		System.out.println("Ya' can't take one down, ya can't pass it around");
		System.out.println("cuz there ain't no bottles of beer on the wall!,");
				
    }
        
			
}
		

    