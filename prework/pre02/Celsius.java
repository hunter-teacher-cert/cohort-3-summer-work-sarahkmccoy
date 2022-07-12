import java.io.*;
import java.util.*;


public class Celsius{
    public static void main(String[] args)
		{
				double celsius;
				double fahrenheit;
				Scanner in = new Scanner(System.in);
				System.out.print("Enter a temperature in celsius: ");
				celsius = in.nextDouble();
				fahrenheit = celsius*9/5 + 32;
				System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);

    }
}
    
