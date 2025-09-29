
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    
  stringManip(paint,house);
  


  }

  public static void lastFirstN(String s1, String s2, int n)
  {
  
      String output;
      String firstN;
      String lastN; 
      
      lastN = s1.substring(s1.length() - n);
      firstN = s2.substring(0,n);

      output = lastN + firstN;


      System.out.println(output);

  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
  
     
      String firstL;
      String secondword;
      String output;

      

      firstL = toUpperCase() s2.substring(0,1);

      secondword = s2.substring(s2.length()- n);

      output = firstL + secondword;

      String firstW = s1.toUpperCase();

      System.out.println(firstW);
      System.out.println(output);

  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
