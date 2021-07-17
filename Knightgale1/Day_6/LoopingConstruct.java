package Day_6;

import java.util.Scanner;

public class LoopingConstruct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x = sc.nextInt();
		
		// Do While
		while(x>0) {
			if(x%2==0) {
				System.out.println("The number is: " + x);
			}
			--x;
		}
		
		System.out.println();
		
		int n = 10;
		do {
			if(n%2==0) {
				System.out.println("The value is: " + n);
			}
			--n;
		}while(n>0);
		
		System.out.println();
		
		// for loop
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("Even number...."+i);
			}
		}
		System.out.println();
		n=10;
		for(;n>0;n--) {
			if(n%2!=0) {
				System.out.println("Odd number...."+n);
			}
		} System.out.println();

		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println("Even number...."+i);
			}
		} System.out.println();
		n=10;
		for(;n>0;n--) {
			if(n%2!=0) {
				System.out.println("Odd number...."+n);
			}
		} System.out.println();
		
		for(int c=0, y=10; c<10 && y>0; c++, y++) {
			System.out.println(c+":"+y);
		}
		}

}
