import java.util.Scanner;

//Question 8
public class Fibonacci {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // for command line input
	    System.out.println("Enter numbe: ");
	    int num = sc.nextInt();
	    //int num=10;
	    int num1=0,num2=1,temp;
	    System.out.print(num1+" "+num2);  // 0 1 
	    
	     for(int i=2;i<num;++i)//loop starts from 2 because 0 and 1 are already printed    
	     {    
	      temp=num1+num2;   
	      
	      System.out.print(" "+temp);
	      
	      num1=num2;    //swaping values
	      num2=temp;    
	     }    
	   
	    sc.close();
	    }
	    
	}


