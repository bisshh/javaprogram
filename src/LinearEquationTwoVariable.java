import java.util.Scanner;

public class LinearEquationTwoVariable {
	public static void main(String args[]){
		int a1, a2, b1, b2, result1, result2, temp_a1, temp_b1, temp_c1, temp_a2, temp_b2, temp_c2, x, y;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input x1 :");
		a1 = scan.nextInt();
		System.out.print("Input y1 :");
		b1 = scan.nextInt();
		System.out.print("Result 1 :");
		result1 = scan.nextInt();
		
		System.out.print("Input x2 :");
		a2 = scan.nextInt();
		System.out.print("Input y2 :");
		b2 = scan.nextInt();
		System.out.print("Result 2 :");
		result2 = scan.nextInt();
		
		if (Math.abs(a1 - a2) > a1) {
			temp_a1 = -(a2) * a1;
			temp_b1 = -(a2) * b1;
			temp_c1 = -(a2) * result1;
		}
		else
		{
			temp_a1 = a2 * a1;
			temp_b1 = a2 * b1;
			temp_c1 = a2 * result1;
		}
		
		temp_a2 = (-a1) * a2;
		temp_b2 = (-a1) * b2;
		temp_c2 = (-a1) * result2;
		
		y = (temp_c1 + temp_c2)/(temp_b1 + temp_b2);
		x = (result1 - (b1 * y)) / a1;
		
		System.out.println("The value of x is : " + x);
		System.out.println("The value of y is : " + y);
	}
}
