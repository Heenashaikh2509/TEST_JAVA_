
//Question 4
import java.util.Scanner;

public class PowerOfTwo {

	

	   static boolean isPowerOfTwo(int n)
	    {
	        if (n == 0)
	            return false;
	 
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	    }
	
	
	public static void main(String[] args) 
	{
		   Scanner sc = new Scanner(System.in); // for command line input
	    System.out.println("Enter number  ");
	   int number = sc.nextInt();
	    
	      
	    
	           if (isPowerOfTwo(number))
	           {
	            System.out.println("Yes "+number +" number is the power of 2 ");
	           }
	           else{
	            System.out.println("No " +number +" number is not the power of 2 ");
	           }
	   	    sc.close();

	    }
	
	
	
	}


