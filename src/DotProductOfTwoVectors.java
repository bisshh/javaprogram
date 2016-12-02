import java.util.Scanner;

public class DotProductOfTwoVectors {
	public static void main(String args[]){
		int i1, i2, j1, j2, k1, k2, vector_addition, vector_substraction, dot_product;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Co-efficient of A Vector in term of i, j, k");
		System.out.print("Input the value of i : ");
		i1 = scan.nextInt();
		System.out.print("Input the value of j : ");
		j1 = scan.nextInt();
		System.out.print("Input the value of k : ");
		k1 = scan.nextInt();
		
		System.out.println("Co-efficient of B Vector in term of i, j, k");
		System.out.print("Input the value of i : ");
		i2 = scan.nextInt();
		System.out.print("Input the value of j : ");
		j2 = scan.nextInt();
		System.out.print("Input the value of k : ");
		k2 = scan.nextInt();
		
		dot_product = (i1 * i2) + (j1 * j2) + (k1 * k2);
		
		System.out.println("Addition vector " + "(" + (i1 + i2) + "," + (j1 + j2) + "," + (k1 + k2) + ")");
		System.out.println("Substraction vector " + "(" + (i1 + (-i2)) + "," + (j1 + (-j2)) + "," + (k1+(-k2)) + ")");
		System.out.println("Dot Product vector : " + dot_product);
	}
}
