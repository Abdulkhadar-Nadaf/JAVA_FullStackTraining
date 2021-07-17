package Day_8;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int i[]= {34,45,56,567,87};
		
		
		System.out.println(i[4]);
		
		System.out.println(i.length);
		
		for(int x=0;x<i.length;x++) {
			System.out.print(i[x]+"\t");
		}
		System.out.println();
		
	
		for(int y:i) {
			System.out.print(y+"\t");
		}
		System.out.println();
		String arr[]=new String[5];
		
		arr[0]="hello";
		arr[1]="hai";
		arr[2]="world";
		
		for(String x:arr) {
			System.out.println(x);
		}
		
		
		int twod[][]= {
				{10,20,30},
				{100,200,300},
				{1000,2000,3000}
		};
		
		System.out.println(twod[2][1]);
		System.out.println("**************************************");
		
		for(int x[]:twod) {
			for(int y:x) {
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		
		System.out.println("*********************************");
		for(int x=0;x<twod.length;x++) {
			for(int z=0;z<twod[x].length;z++) {
				System.out.print(twod[x][z]+"\t");
			}
			System.out.println();
		}
		
	}

}
