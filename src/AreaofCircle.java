import java.util.Scanner;

public class AreaofCircle {
	public static void main(String args[]){
		double r, area, circumference;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input radius: ");
		r = scan.nextDouble();
		
		area = Math.PI * r * r;
		System.out.println("The area of circle is: " + area);
		
		circumference = 2 * Math.PI * r * r;
		System.out.println("The circumference is: " + circumference);
	}
}
