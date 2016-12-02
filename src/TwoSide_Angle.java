import java.util.Scanner;

public class TwoSide_Angle {
	public static void main(String args[]){
		double a, b, area;
		int angle;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the value of a: ");
		a = scan.nextDouble();
		System.out.print("Input the value of b: ");
		b = scan.nextDouble();
		System.out.print("Input the angle: ");
		angle = scan.nextInt();
		
		area = ((a * b) * Math.sin(Math.toRadians(angle))) / 2;
		System.out.println("The area of rectangle " + "with angle " + angle + " is : " + area);
	}
}
