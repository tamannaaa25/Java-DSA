import java.util.Scanner;

public class SpiralTraversal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m= sc.nextInt();

        int[][] arr= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minr=0;
        int minc=0;
        int maxr=n-1;
        int maxc=m-1;
        int totalElements = n*m;
        int count=0;

        while(true){
            //left wall
            for(int i=minr, j=minc; i<=maxr && count<totalElements; i++){
                System.out.print(arr[i][minc]+" ");
                count++;
            }
            minc++;
            //right wall
            for(int i=maxr, j=minc; j<=maxc && count<totalElements; j++){
                System.out.print(arr[maxr][j]+" ");
                count++;
            }
            maxr--;
            //top wall
            for(int i= minc, j=maxc; i<=maxr && count<totalElements; i--){
                System.out.print(arr[i][maxc]+" ");
                count++;
            }
            maxc--;
            //bottom wall
            for(int i= maxr, j=maxc; j>=minc && count<totalElements; j--){
                System.out.print(arr[minr][j]+" ");
                count++;
            }
            minr++;
        }
    }
}

