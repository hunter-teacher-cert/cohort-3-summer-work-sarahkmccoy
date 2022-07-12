import java.io.*;
import java.util.*;


public class Guess{
    public static void main(String[] args)
		{
			//pick a random number
				Random random = new Random();
        int number = random.nextInt(100)+1;
				int guess;
				int error;
				Scanner in = new Scanner(System.in);
				System.out.println("I'm thinking of a number between 1 and 100 (inclusive).  Can you guess what it is? ");
				System.out.println("Type a number:");
				guess = in.nextInt();
				System.out.println("Your guess is: " + guess);
				error = number - guess;
				System.out.println("The number I was thinking of is: " + number);
				System.out.println("You were off by: " + error);
    }
}