package Week2_Lab1;

public class SumElementOfArray {
	public static void main(String args[]){ 
		 int[] array = {10, 20, 30, 40, 50, 10}; 
		int sum = 0; 
		
		for( int num : array) { 
		 sum = sum+num; 
		 } 
		 System.out.println("Sum of array elements is:"+sum); 
		 } 

}
