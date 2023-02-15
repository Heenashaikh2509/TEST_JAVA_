import java.util.Scanner;

//Qustion 9
public class PascalPattern {

	
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in); // for command line input
	    System.out.println("Enter number of rows: ");
	    int Num= sc.nextInt();
	  //  int Num=5; to print given output use no rows =5
	    for (int i= 0; i<= Num-1 ; i++)
	        {
	            for (int j=0; j<=i; j++)
	            { 
	                System.out.print("*"+ " "); 
	                
	            } 
	            System.out.println("");
	        } 
	        for (int i=Num-1; i>=0; i--)
	        {
	            for(int j=0; j <= i-1;j++)
	            {
	                System.out.print("*"+ " ");
	            }
	            System.out.println("");
	        }
	    sc.close();

	}

}
