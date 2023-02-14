//Question 5
public class SortArray {

	
	public static void main(String[] args) 
	
	{
	    /*Scanner sc = new Scanner(System.in); // for user input
	    System.out.println("Enter number of rows: ");
	    string InputStr = sc.next();*/

        int[] numArray = new int[] {33, 13, 1, 3, 90, 34, -1, -4, 6, 0, 20, -20};  
        System.out.println("Sorted Array:");  
        
        for (int i = 0; i < numArray.length; i++)   
        {  
        for (int j = i + 1; j < numArray.length; j++)   
        {  
        int tmp = 0;  
        if (numArray[i] > numArray[j])   
        {  
        tmp = numArray[i];  
        numArray[i] = numArray[j];  
        numArray[j] = tmp;  
        }  
        }  
        //prints the sorted array
        System.out.println(numArray[i]);  
        }  
}

	}


