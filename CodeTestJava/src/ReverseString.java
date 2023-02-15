
//Question 7
import java.util.Scanner;


public class ReverseString

{
	public static String reverseTheString(String inputstr)
	   {  
	        char chArray[]=inputstr.toCharArray();  
	        
	        String revStr="";  
	                for(int i=chArray.length-1;i>=0;i--){  
	                    revStr+=chArray[i];  
	                }  
	        return revStr;  
	    }  
	public static void main(String[] args)
	
	{
		 Scanner sc = new Scanner(System.in); // for user input
	    System.out.println("Enter String to be reversed  ");
	    String InputStr = sc.next();
	    
	    // String InputStr="Hello Java";
	     System.out.println("Reversed String");  
	     System.out.println( reverseTheString(InputStr));  
	      
	    sc.close();
	    }
	    
		
	}


