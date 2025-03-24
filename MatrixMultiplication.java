import java.util.Scanner;
public class MatrixMultiplication {


    static void multiplyMatrix(int A[][], int B[][], int R1 ,int C1 , int R2 , int C2){
        int[][] result = new int[R1][C2];

        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                result[i][j]=0;
                for(int k=0;k<C1;k++){
                    result[i][j] =  result[i][j] + A[i][k]*B[k][j];
                }
            }
        }

        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                System.out.print(result[i][j]+" ");
        }
        System.out.println();
    }
    
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
    
        int[][] A = new int[R1][C1];
        for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++){
                A[i][j]=sc.nextInt();
            }
        }


        int R2 = sc.nextInt();
        int C2 = sc.nextInt();
    
        int[][] B = new int[R2][C2];
        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                B[i][j]=sc.nextInt();
            }
        }
        multiplyMatrix(A, B, R1, C1, R2, C2);
    }
}


