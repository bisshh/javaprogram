import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String args[]){
		double a, b, result, temp, d, x1, x2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input x1 :");
		a = scan.nextDouble();
		System.out.print("Input y1 :");
		b = scan.nextDouble();
		System.out.print("Result 1 :");
		result = scan.nextDouble();
		
		if(a == 0){
			System.out.println("This is not a Quadratic Equation, enter Factor A at least");
		}
		
		d = (b * b) - (4 * a * result);
		
		if (d >= 0 || a != 0 && b != 0 && result != 0)
        {
            x1 = (-(b) + Math.sqrt(d)) / 2 / a;
            x2 = (-(b) - Math.sqrt(d)) / 2 / a;
            
            System.out.println("First Value of x : " + x1);
    		System.out.println("First Value of x : " + x2);
        }
		
		System.out.println("Determinate : " + d);
	}
}
