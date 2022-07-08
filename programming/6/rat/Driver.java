/**
 * class Driver
 * tester class for class Rational
 */

public class Driver
{
  public static void main( String[] args )
  {
    //cut/paste this leading comment bar down, one line at a time, as you test...
    
      Rational r = new Rational( 1, 2 );
      Rational s = new Rational(1, 5);
      Rational t = new Rational( 1, 4 );
      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );
      Rational x = new Rational( 8, 12 );
      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );
    
      System.out.println( r + " as a floating pt   approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );
 System.out.print( r + " * " + t + " = ");
 r.multiply(t);
 System.out.println(r);
System.out.print( r + " / " + t + " = ");
 r.divide(t);
 System.out.println(r);
      
 }

}//end class