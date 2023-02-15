
//Question 3
import java.util.Scanner;


public class Palindrome {

	
	
	
	public static void main(String[] args)
	
	{
		
		 int n,m,sum=0,temp;
		 //take the input from user
		  Scanner sc = new Scanner(System.in);

	      System.out.print("Enter a number: ");
	       n = sc.nextInt();
	      
	       temp=n;    
	       while(n>0)
	       {    
	        m=n%10;  //getting remainder  
	        sum=(sum*10)+m;    
	        n=n/10;    
	       }    
	       if(temp==sum) 
	       {
	        System.out.println(" is palidrom number"); 
	       }
	       else    
	       {
	        System.out.println(" is not palidrom number");    
	     }  
	      
		    sc.close();

	}

	
	
}
