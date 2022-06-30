import java.io.*;
import java.util.*;

public class max{
	public static void main(String[] args) {
		//Testing with an array with a non-repeated max value. I first generated a randomArray, but since that tended to have repeats, I felt like it was sort of silly to report the index, rather than the actual max. So I ran the program using an array with no duplicates.
	
		int[] numlist = {5, 30, 1000, -1, 100,-20};
		
		System.out.println("Here is an array:");
		System.out.println(Arrays.toString(numlist));
		
		int maxindex = indexOfMax(numlist);
		System.out.println("Here is the index of the maximum value in that array: "+ maxindex);
		
	}

//indexOfMax trying to do with enhanced loop--so, I guess the answer is that yes, you can use an enhanced loop, because this works.  Doesn't save much time or look better though, since you have to put in i anyway.
	public static int indexOfMax(int[] a){
		int max = a[0];//Set max to first element in list.
		int i = 0; //to traverse list
		int index = 0;//to store index each time a bigger number is found
		for (int num : a){
    	if (num > max){
				max = num;
				index = i;
				}
			i++;
			}
		return index;
	}
	//Create a random array of integers between 1 and and the size of the array, 
	public static int[] randomArray(int size){
		Random random = new Random();
		int[]a = new int[size];
		for (int i=0; i <a.length; i++) {
			a[i]=random.nextInt(size);
		}
			return a;
		}
}
