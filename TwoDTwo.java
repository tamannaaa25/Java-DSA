/*
 Print elements according to pattern similar to number 2 :
Given a square matrix mat[][], and you have to traverse the input matrix
and print elements according to a specific pattern which is similar to integer
2.
Note -> you can take reference to sample input and output for better
understanding which type of pattern you have to print using array elements.
Input Format
First line - Take size of array N.
Second line - Take N*N integer value to store them in a 2D array or square matrix.
Output Format
Print all the elements in specific order which came under a pattern similar to
integer 2.
Output elements should print in single line and space separated.
Constraints
3 ≤ N ≤ 11
0 ≤ arr[i] ≤ 10^3
Input :                             Output: 7 1 5 4 9 2 11 8 0
3
7 1 5
2 9 4
11 8 0
 */

import java.util.Scanner;

public class TwoDTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //left top to right top
        for(int j= 0; j<N ; j++){
            System.out.println(arr[0][j]+" ");
        }

        for(int i=N-1;i>=0;i--){
            System.out.println(arr[i][N-i]+" ");
        }

        for (int j = 0; j < N; j++) {
            System.out.print(arr[N - 1][j] + " ");
        }
    }
}
