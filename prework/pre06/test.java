import java.io.*;
import java.util.*;

public class test{
	public static void main(String[] args) {
	    for (int a = 1; a < 100; a++) {
				loop(a);
			}
		}

	public static void loop(int n) {
    	int i = n;
    	while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
	}
}