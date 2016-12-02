//Syntax:
//	do {
//			Statement(s);
//			increment/decrement;
//		}
//	while(condition);
import java.util.Scanner;

public class DoLoop {
	
	static int a, b, result, task;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void askInput(){
		System.out.print("Input number a: ");
		a = scan.nextInt();
		
		System.out.print("Input number b: ");
		b = scan.nextInt();
	}
	
	public static void main(String args[]){
		System.out.println("Menu Selection");
		System.out.println("Choose 1. for addition");
		System.out.println("Choose 2. for substraction");
		System.out.println("Choose 3. for Division");
		System.out.println("Choose 0. for exit");
			
		do {
			System.out.print("Choose menu:");
			task = scan.nextInt();
			
			if(task == 1)
			{
				askInput();
				result = a + b;
				System.out.println("Addition of number is :" + result);
			}
			else if(task == 2)
			{
				askInput();
				result = a - b;
				System.out.println("Substraction of number is :" + result);
			}
			else if(task == 3)
			{
				askInput();
				result = a / b;
				System.out.println("Division of number is :" + result);
			}
		} while(task != 0);		
	}
}
