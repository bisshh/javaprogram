// Nested Loop
// - a loop within another loop
// Syntax:
// for(initialization1; condition1; increment1/decrement1){ //row
// 	Statement1(s);	
//	for(initialization2; condition2; increment2/decrement2){ //column
// 		Statement2(s);	
//	}
//}

public class NestedLoop {
	public static void main(String args[]){
		int i, j;
		
		// i = row
		// j = column 
		
		//Scanner scan = new Scanner(System.in);
				
		for(j = 1; j <= 5; j++) {
			for(i = 1; i <= 5; i++) {
				System.out.print(i);			
			}
			System.out.println("");
		}
	}
}
