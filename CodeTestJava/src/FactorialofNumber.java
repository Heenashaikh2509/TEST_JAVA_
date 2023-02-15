//Question 10 
import java.util.Scanner;

public class FactorialofNumber {

	
	
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in); // for command line input
	    System.out.println("Enter number  ");
	    int num = sc.nextInt();
	    //int num=5;
	    int fact=1;
	    for (int i= 1; i<= num ; i++)
	        {
	            fact=fact*i;
	        }
	        
	    System.out.println("Factorial of " +num +" is "+fact );
	    sc.close();
	}

}
