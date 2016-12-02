import java.util.Scanner;

public class LeanearEquationThreeVariable {
	public static void main(String args[]){
		int a1, a2, a3, b1, b2, b3, c1, c2, c3, result1, result2, result3, temp, x, y, z;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input x1 :");
		a1 = scan.nextInt();
		System.out.print("Input y1 :");
		b1 = scan.nextInt();
		System.out.print("Input z1 :");
		c1 = scan.nextInt();
		System.out.print("Result 1 :");
		result1 = scan.nextInt();
		
		System.out.print("Input x2 :");
		a2 = scan.nextInt();
		System.out.print("Input y2 :");
		b2 = scan.nextInt();
		System.out.print("Input z2 :");
		c2 = scan.nextInt();
		System.out.print("Result 2 :");
		result2 = scan.nextInt();
		
		System.out.print("Input x3 :");
		a3 = scan.nextInt();
		System.out.print("Input y3 :");
		b3 = scan.nextInt();
		System.out.print("Input z3 :");
		c3 = scan.nextInt();
		System.out.print("Result 3 :");
		result3 = scan.nextInt();
		
		temp = (a1 * b2 * c3 + b1 * a3 * c2 + c1 * a2 * b3) - (a1 * c2 * b3 + b1 * a2 * c3 + c1 * b2 * a3);		
		x = ((b1 * c3 * result2 + c1 * b2 * result3 + result1 * c2 * b3) - (b1 * c2 * result3 + c1 * b3 * result2 + result1 * b2 * c3)) / temp;
		y = ((a1 * c2 * result3 + c1 * a3 * result2 + result1 * a2 * c3) - (a1 * c3 * result2 + c1 * a2 * result3 + result1 * c2 * a3)) / temp;
		z = ((a1 * b3 * result2 + b1 * a2 * result3 + result1 * b2 * a3) - (a1 * b2 * result3 + b1 * a3 * result2 + result1 * a2 * b3)) / temp;
		
		System.out.println("Result: " + x);
		System.out.println("Result: " + y);
		System.out.println("Result: " + z);
	}
}
