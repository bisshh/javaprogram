import java.util.Scanner;

public class Vowel {
	public static void main(String args[]){
		char a;
		Scanner vowel = new Scanner(System.in);
				
		System.out.print("Please input your letter : ");
		a = vowel.next().charAt(0);
		
		if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U')
		{
			System.out.print("Your input letter is vowel.");
		}
		else {
			System.out.print("Your input letter is consonant");			
		}
		
	}
}
