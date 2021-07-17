package Day_5;

public class ConditionDemo1 {
public static void main(String[] args) {
		
		int i =100;
		
		if(i==100) {
			System.out.println("Equal to 100");
		}
		else {
			System.out.println("Not equal to 100");
		}
		
		// ? - ternary operator
		System.out.println((i==100)?"Even number":"Odd number");
		
		if(i==100) {
			System.out.println("Equal to 100");
		}
		else if(i!=100) {
			System.out.println("Not equal to 100");
		}
		else if(i<=100) {
			System.out.println("i value is lesser then 100");
		}
		else if(i>=100) {
			System.out.println("i value is greater then 100");
		}
		else {
			System.out.println("None of the condtion Satisfied");
		}
	}


}
