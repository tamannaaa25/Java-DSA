import java.util.*;
class day6 {
    /* 
    public int maximumCount(int[] nums) {
        int a = 0, b = 0;
        for (int x : nums) {
            if (x > 0) {
                ++a;
            } else if (x < 0) {
                ++b;
            }
        }
        return Math.max(a, b);
    }
    */

    public int peakIndexMountainArray(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start < end){
            int mid= start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
    }
}