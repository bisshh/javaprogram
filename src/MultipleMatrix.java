import java.util.Scanner;

public class MultipleMatrix {
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
        
        if(j != m){
            System.out.println("Entered matrixes cannot be multiplied");
            
        }
        else{
            int second[][] = new int[m][n];
            int multiply[][] = new int[i][n];
            
            System.out.println("Enter the elements of the second matrix");
            for(c = 0; c < m; c++)
                for(d = 0; d < n; d++)
                    second[c][d] = in.nextInt();
            
            for(c = 0; c < i; c++){
                for(d = 0; d < n; d++) {
                    for(k = 0; k < m; k++){
                        sum = sum + first[c][k] * second[k][d];
                    }
                    multiply[c][d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product is : ");
            for(c = 0; c < i; c++){
                for(d = 0; c < i; d++){
                    System.out.println(multiply[c][d]);
                }
            }
        }
	}
}
