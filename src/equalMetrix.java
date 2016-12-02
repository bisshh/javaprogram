import java.util.Scanner;

public class equalMetrix {
	public static void main(String[] args) {
        int i, j, c, d, k, m, n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of the first matrix");
        i = in.nextInt();
        j = in.nextInt();
        
        int first[][] = new int[i][j];
        
        System.out.println("Enter the elements of the first matrix");
        for(c = 0; c < i; c++)
            for(d = 0; d < j; d++)
                first[c][d] = in.nextInt();
        
        System.out.println("Enter the number of rows and columns of second matrix");
        m = in.nextInt();
        n = in.nextInt();
        
        int second[][] = new int[m][n];
        System.out.println("Enter the elements of the second matrix");
        for(m = 0; m < i; m++)
            for(n = 0; n < j; n++)
                first[m][n] = in.nextInt();
        
        if(i == m && j == n){
            System.out.println("Matrix can be compare");
            for(c = 0; c < 0; c++){
                for(d = 0; d < 0; d++){
                    if(first[i][j] == second[i][j]){
                        System.out.println("Matrix are equal.");
                    }
                    else{
                        
                    }
                }    
            }
        }
        else{
            System.out.println("Matrix cannot be compared.");
        }        
    }
}
