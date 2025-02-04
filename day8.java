
import java.util.*;
public class day8 {
    public static void main(String[] args) {
        int[] arr={2,-32,0,78,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i =0; i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex,last);
        }
    }

    static void swap (int[] arr, int first , int second ){
        int temp = arr[first];
        arr[ first]= arr[ second];
        arr[second]= temp;
    }


    static int getMaxIndex(int[] arr, int start, int end ){
        int max = start ; 
        for(int i = start ; i<= end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}
