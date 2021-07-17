package Day_6;

public class BreakContinue {
public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				continue;
			} System.out.println("Odd number: " + i);
		} 
		
		boolean a = true;
		a:{
			
			System.out.println("a block..");
			b:{
				
				System.out.println("b block..");
				c:{
					if(a) {
						break a;
					}
					System.out.println("c block..");
				}
			}
		}
			
		}

}
