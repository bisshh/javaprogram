//WAP to calculate the sum of even numbers between 1 to 50

public class ForLoop {
	public static void main (String args[]){
		int sum = 0, i = 1;
				
		for(i = 1; i <= 50; i++)
		{
			if (i%2 == 0){
				sum = sum + i;
				//System.out.println("The sum is : " + sum); // individual sum
			}
		}
		
		System.out.println("The sum is : " + sum);
	}
}
