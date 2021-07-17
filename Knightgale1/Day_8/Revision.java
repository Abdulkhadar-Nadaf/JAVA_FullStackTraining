package Day_8;

import java.util.Scanner;

public class Revision {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value..:");
		int x=scan.nextInt();
		boolean b=x>=10;
		if(b) {
				System.out.println("true called....");
			}
			else {
				System.out.println("false called...");
			}
			
			String result=(b)?"ternary true called...":"ternary false called..";
			System.out.println(result);
			
			switch(x%2) {
			case 0:{
				System.out.println(" case 0");
				break;
			}
			case 1:{
				System.out.println("case 1");
			}
			}
		
		
			for(int y=2;y<10; ++y) {
				System.out.println("for loop....:"+x);			
			}
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print("*"+"\t");
				}
				System.out.println();
			}
			
			for(int i=0;i<10;i++) {
				if(i%2==0) {
					continue;
				}
				System.out.println(i);
			}
		}

}
