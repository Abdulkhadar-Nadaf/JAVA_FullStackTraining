package Day_6;

public class ArrayDemo {
	public static void main(String[] args) {
		int marks[]= {98,89,99};
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println();
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println();
		
		int score[]=new int[3];
		score[0]=1010;
		score[1]=3939;
		score[2]=2333;
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
	}

}
