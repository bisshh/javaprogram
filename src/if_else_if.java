import java.util.Scanner;

public class if_else_if {
	public static void main(String args[]){
		int a, b, c;
		Scanner scan = new Scanner(System.in);
				
		System.out.print("Please input the value of a : ");
		a = scan.nextInt();
		
		System.out.print("Please input the value of b : ");
		b = scan.nextInt();
		
		System.out.print("Please input the value of c : ");
		c = scan.nextInt();
		
		if (a > b && a > c)
		{
			System.out.print("a is greater.");
		}
		else if (a < b && b > c) {
			System.out.print("b is greater.");			
		}
		else {
			System.out.print("c is greater.");			
		}
	}
}
