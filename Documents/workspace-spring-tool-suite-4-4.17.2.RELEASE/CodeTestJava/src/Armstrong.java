//Question 6
import java.util.Scanner;

public class Armstrong {

	static boolean isArmstrong(int n)   
    {   
        int temp, digits=0, lastnum=0, sum=0;   
        temp=n;
        
        while(temp>0)    
        {   
        temp = temp/10;   
        digits++;   
        }   
        
        temp = n;   
        
        while(temp>0)   
        {   
        
        lastnum = temp % 10;
        sum +=  (Math.pow(lastnum, digits));
        temp = temp/10;   
        }  
        
        if(n==sum){
        return true;
            
        }   
        else 
        {
            return false;   
        } 
    }
        
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in); // for command line input
	    System.out.println("Enter number ");
	    int num = sc.nextInt();
	    //int num=144;
	   
	       if(isArmstrong(num))  
	        {  
	        System.out.print(num +" is Armstrong ");  
	        }  
	        else   
	        {  
	        System.out.print(num+" is Not Armstrong ");  
	        }  
	    sc.close();
		
	}

}
