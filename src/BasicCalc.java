import java.util.Scanner;
public class BasicCalc {
	public static void main (String args[]){
		double Num1, Num2, Result;
		Scanner Resham = new Scanner(System.in);
		
		System.out.print("Enter the First number:");
		Num1 = Resham.nextDouble();
		
		System.out.print("Enter the Second number:");
		Num2 = Resham.nextDouble();
		
		Result = Num1 + Num2;
		
		System.out.print("The sum of two number is :" + Result);
	}
}
