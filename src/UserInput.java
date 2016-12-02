import java.util.Scanner;

public class UserInput {
	public static void main (String arg[]){
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please input the value of a:");
		a = scan.nextInt();
		
		System.out.print("Please input the value of b:");
		b = scan.nextInt();
		
		System.out.print("Your result is :" + (a + b));
	}
}
