//WAP to calculate the total sum of odd numbers and multiples of 7

public class WhileLoop {
	public static void main (String args[]){
		int i=1, sum = 0;
		
		while(i <= 70) {
			if (i%2 != 0 && i%7 == 0){
				sum = sum + i;
			}
			i++;
		}
		System.out.println("The sum is :" + sum);
	}
}
