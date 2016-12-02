//WAP to ask integer values and calculate their sum until user enters 0.
import java.util.Scanner;
public class WhileLoop1 {
	public static void main(String args[]){
		int i = 1, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		while(i != 0){
			System.out.print("Input the number : ");
			i = scan.nextInt();
			
			sum = sum + i;
		}
		System.out.println("The total sum is : " + sum);
		
	}
}
