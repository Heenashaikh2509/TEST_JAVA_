//Question 2
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	
	{
		int n,i,j=0,flag=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
	       n = sc.nextInt();

	      j=n/2;      
	      if(n==0||n==1){  
	       System.out.println(n+" is not prime number");      
	      }else
	      {  
	       for(i=2;i<=j;i++)
	       {      
	        if(n%i==0){      
	         System.out.println(n+" is not prime number");      
	         flag=1;      
	         break;      
	        }      
	       }      
	       if(flag==0)  
	       { 
	    	   System.out.println(n+" is prime number"); 
	    	   
	       }  

	      }//end of else  
	

	}

}
