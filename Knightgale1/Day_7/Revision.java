package Day_7;

public class Revision {
	public static void main(String[] args) {
		
		// casting Demo
		byte b=127;
		short s=b;
		int i=s;
		long l=i;
		
		l=257;
		System.out.println("long value..:"+l);
		i=(int)l;
		System.out.println("int value..:"+i);
		s=(short)i;
		System.out.println("short value..:"+s);
		b=(byte)s;
		System.out.println("byte value..:"+b);	
		
		//auto promotion
		byte mybite1=120;
		byte mybite2=2;
		byte result=(byte)(mybite1*mybite2);
		System.out.println(result);
		int myint=mybite1*mybite2;
		System.out.println(myint);
		
		double d=23.45;
		float myf=(float)d;
		
		char ch='a';
		byte myfloat=(byte)ch;
		System.out.println(myfloat);
		
		short myshortch=64;
		char ccc=(char)myshortch;
		System.out.println(ccc);
	}

}
