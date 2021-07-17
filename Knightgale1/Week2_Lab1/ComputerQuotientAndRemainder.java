package Week2_Lab1;
import java.util.Scanner; 

public class ComputerQuotientAndRemainder {
	public static void main(String[] args) {
		int dividend = 25, divisor = 4; 
		 int quotient = dividend / divisor; 
		 int remainder = dividend % divisor; 
		 System.out.println("Quotient = " + quotient); 
		 System.out.println("Remainder = " + remainder); 
		 
		 
		 
		  int num; 
		  System.out.println("Enter an Integer number:"); 
		  
		  Scanner input = new Scanner(System.in); 
		  num = input.nextInt(); 
		 
		 if ( num % 2 == 0 ) 
		  System.out.println("Entered number is even"); 
		  else
		  System.out.println("Entered number is odd"); 
		  } 
		 } 
	
