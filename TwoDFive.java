/*
 Given a square matrix mat[][], and you have to traverse the input matrix and
print elements according to a specific pattern which is similar to integer 5.
Note -> you can take reference to sample input and output for better
understanding which type of pattern you have to print using array elements.
Input Format
First line - Take size of array N.
Second line - Take N*N integer value to store them in a 2D array or square
matrix.
Output Format
Print all the elements in specific order which came under a pattern similar to
integer 5.
Output elements should print in a single line and space separated.

INPUT : 3
7 1 5
2 9 4
11 8 0

OUTPUT: 5 1 7 2 9 4 0 8 11
 */
import java.util.Scanner;
public class TwoDFive {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];

        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]=sc.nextInt();
            }
        }

            //way one 
            for(int i=N-1 ; i>=0;i--){
                System.out.print(arr[0][i]+" ");
            }
            

            //way two
            for(int i=1; i<N-1;i++){
                System.out.print(arr[i][0]+" ");
            }
            

            //way three
            for(int i=1; i<N-1;i++){
                System.out.print(arr[N-1][i]+" ");
            }
            sc.close();
        
    }
}
