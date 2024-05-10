public class ArraySum
 { 
 	public static void main(String args[] )
 	{ 
 		// Test your arraySum method.
 		// Use other test cases as well. 
 		int[] inputArray = {1, -24, 9, 345, 176, 78, -7}; 
 		int sum = arraySum(inputArray); 
 		System.out.println(sum);
 	} 

    public static int arraySum(int[] sumArray) 
    { 
    	//In this assignment you will write the arraySum method that computes the sum of the items of an integer array. The method takes as an argument an integer array and returns the sum of the argument array items.
		//For example, if: 
		//the input array is [3, 4, 9, 22, 17], method returns 55 
		//the input array is [1, -24, 9, 345, 176, 78, -7], method returns 578	
    		int sum = 0;
			for (int i = 0; i < sumArray.length; i++)
			{
				sum += sumArray[i];
			}
			return sum;
			


    } 
} 