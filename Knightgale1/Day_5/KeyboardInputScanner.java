package Day_5;

import java.util.Scanner;

public class KeyboardInputScanner {
public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the value: ");
		
		int i = scan.nextInt();
		System.out.println("The value of i is: " + i);
		
		System.out.println((i%2==0)?"Even Number":"Odd Number");
		
		if(i>40 && i<60) {
			System.out.println("Second Class");
		}
		else if(i>60 && i<80) {
			System.out.println("Distinction");
		}
		else{
			System.out.println("Topper");
		}
	}

}
