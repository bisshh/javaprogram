// Syntax

//switch (variable)
//{
	//case value1:
	//{
		//Statement(s);
		//break;
	//}
	//case value2:
	//{
		//Statement(s);
		//break;
	//}
	//case valuen:
	//{
		//Statement(s);
		//break;
	//}
	//default:
	//{
		//Statement(s);
	//}
//}

import java.util.Scanner;
public class SwitchStatement {
	public static void main(String args[]){
		char a;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input your character :");
		a = scan.next().charAt(0);
		
		switch (a) {
			case 'a':
			{
				System.out.print("It is vowel.");
				break;
			}
			case 'e':
			{
				System.out.print("It is vowel.");
				break;
			}
			case 'i':
			{
				System.out.print("It is vowel.");
				break;
			}
			case 'o':
			{
				System.out.print("It is vowel.");
				break;
			}
			case 'u':
			{
				System.out.print("It is vowel.");
				break;
			}
			default:
			{
				System.out.print("It is consonant.");
			}
		}
	}
}