import java.util.Scanner;

public class resultPercentage {
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		
		int ph, ch, bi, en, ma, total, division;
		
		System.out.print("Input Physics mark : ");
		ph = scan.nextInt();
		System.out.print("Input Chemestry mark : ");
		ch = scan.nextInt();
		System.out.print("Input Biology mark : ");
		bi = scan.nextInt();
		System.out.print("Input English mark : ");
		en = scan.nextInt();
		System.out.print("Input Math mark : ");
		ma = scan.nextInt();
		
		total = ph + ch + bi + en + ma;
		division = total / 5;
		
		if(ph < 40 || ch < 40 || bi < 40 || en < 40 || ma < 40){
			System.out.print("Fail");
		}
		
		else if (division >= 80 && division <=100) {
			System.out.print("Distinction");
		}
		
		else if (division >= 60 && division <= 79) {
			System.out.print("First Division");			
		}
		
		else if (division >= 40 && division <= 60) {
			System.out.print("Second Division");			
		}
		
		else {
			System.out.print("Fail");
		}
	}
}
