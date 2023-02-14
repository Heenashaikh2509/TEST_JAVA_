//Question 1
import java.util.Scanner;

public class EvenOdd

{
  public static void main(String args[])
  {
	   //take the input from user
	  Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int n = sc.nextInt();
      
    
      if(n%2==0)
      {
          System.out.println("Number is even");
      }
      else
      {
      System.out.println("Number is odd");
  }
	    sc.close();

  }
}
