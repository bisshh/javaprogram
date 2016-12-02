import java.util.Scanner;

public class AreaOfTraingleUsing3Sides {
	public static void main(String args[]){
		double a, b, c, area, temp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the value of Side a: ");
		a = scan.nextDouble();
		System.out.print("Input the value of Side b: ");
		b = scan.nextDouble();
		System.out.print("Input the value of Side c: ");
		c = scan.nextDouble();
		
		temp = a + b + c;
		area = Math.sqrt(temp * (temp - a) * (temp - b) * (temp - c));
		
		System.out.println("The area of rectangle with 3 side is : " + area);
	}
}
