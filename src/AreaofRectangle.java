import java.util.Scanner;

public class AreaofRectangle {
	public static void main(String args[]){
		int l, b, area, perimeter;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input length: ");
		l = scan.nextInt();
		
		System.out.print("Input breadth: ");
		b = scan.nextInt();
		
		area = l * b;
		System.out.println("The area of rectangle is : " + area);
		
		perimeter = 2 * (l+b);
		System.out.println("The perimeter of rectangle is : " + perimeter);
	}
}
