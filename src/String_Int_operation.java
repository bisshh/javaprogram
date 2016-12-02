import java.util.Scanner;

public class String_Int_operation {
	public static void main(String args[]){
		int a,b;
		String c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input add to addition, sub to substract, multiply to multiply, division to divide :");
		c = scan.nextLine();
		
		System.out.println("Please input the value of a :");
		a = scan.nextInt();
		
		System.out.println("Please input the value of b :");
		b = scan.nextInt();
		
		if(c.equals ("add")) {
			System.out.print("The sum of two number is " + (a+b) );			
		}

		else if(c.equals("sub")) {
			System.out.print("The difference of two number is " + (a-b) );			
		}
		
		else if(c.equals("multiply")) {
			System.out.print("The product of two number is " + (a*b) );			
		}
		
		else if(c.equals("division")) {
			System.out.print("The quotient of two number is " + (a/b) );			
		}
		
		else {
			System.out.print("Invalid input.");			
		}
	}
}
