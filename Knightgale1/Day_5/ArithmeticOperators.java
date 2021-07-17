package Day_5;

public class ArithmeticOperators {
public static void main(String[] args) {
		
		int a = 5; // = > assigned
		int b = 2;
		
		int c = a+b; // addition 
		int d = a-b; // subtraction
		int e = a*b; // multiplication
		int f = a/b; // division
		int g = a%b; // reminder
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		System.out.println(a++); // post Increment > 5
		System.out.println(a);	 // 6
		
		System.out.println(++a); // pre Increment > 7
		System.out.println(a);	 // 7
		
		System.out.println(a--); // post decrement > 7
		System.out.println(a);	 // 6
		
		System.out.println(--a); // pre decrement > 5
		System.out.println(a);	 // 5
		
		System.out.println("********* \n");
		
		int hr = 10;	// another syntax to achieve the addition in a short way
		hr += 1;
		System.out.println(hr);
		
		int hr1 = 10;	// another syntax to achieve the subtraction in a short way
		hr1 -= 1;
		System.out.println(hr1);
		
		int hr2 = 10;	// another syntax to achieve the multiplication in a short way
		hr2 *= 1;
		System.out.println(hr2);
		
		int hr3 = 10;	// another syntax to achieve the division in a short way
		hr3 /= 1;
		System.out.println(hr3);
		
		int hr4 = 10;	// another syntax to achieve the reminder in a short way
		hr4 %= 1;
		System.out.println(hr4);
}

}
