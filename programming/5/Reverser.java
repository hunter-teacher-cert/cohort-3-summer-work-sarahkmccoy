/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: Rachel Kaufman
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR(String s)
	{
  //this is a regular string reverser using a for loop
	// {
  //   String newString = "";
		// for (int i=s.length()-1; i>=0; i--){
		// 	newString += s.charAt(i);
		// }
  //   return newString.

	  String newString;
    
    System.out.println(s);//print trace to help see it
		if (s.length() < 1){
      return s;
    }
      newString = reverseR(s.substring(1)) + s.charAt(0);

    return newString;
   
  }


  public static void main( String[] args )
  {
    System.out.println( reverseR("odd") );
    System.out.println( reverseR("even") );
    System.out.println( reverseR("abcdefg") );
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("amanaplanacanalPanama") );

    //more tests welcome
    // got some good palindromes?
  }
}