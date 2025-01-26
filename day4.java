/* 
import java.util.*;
public class day4 {
    
    public static void main(String[] args) {
        int[] arr ={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target= 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int[] arr ={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target= 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        boolean isAsc;
        if( arr[start]<arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start<=end){
            int mid= start + (end-start)/2;


            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }else{
            if(target>arr[mid]){
                end = mid-1;
            }else if(target<arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
       
    }
    return -1;
    //return start for ceiling. 
    // return end for floor.
    }

}
*/



//You are given an array of characters letters that is sorted in non-decreasing order, 
// and a character target.
//There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target.
//If such a character does not exist, return the first character in letters.

/* 
import java.util.*;

public class day4 {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target= 'a';
        day4 obj = new day4();

        System.out.println(obj.nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end= letters.length-1;

        while(start<=end){
            int mid= start + (end - start)/2;
            if(target<letters[mid]){
                end= mid-1;
            }else if(target>letters[mid]){
                start= mid+1;
            }else{
                start= mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
*/

//Given an array of integers nums sorted in non-decreasing order, 
//find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.


/* 
import java.util.*;

public class day4 {
    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};
        int target= 8;
        int anss = searchRange(nums, target);

        System.out.print(anss);
    }

    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]= start;
        ans[1]= end;
        return ans;

        
   
    }

    int search (int[] nums, int target, boolean findStartIndex){
        int start =0;
        int end= nums.length-1;
        
        int ans =-1;
        
        
        while(start<=end){
            int mid= start +(end - start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }else{
                ans=mid;
                if(findStartIndex== true){
                    end= mid-1;
                }else{
                    start= mid+1;
                }
            }
        }
        return ans;
    }
}



class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]= start;
        ans[1]= end;
        return ans;

        
   
    }

    int search (int[] nums, int target, boolean findStartIndex){
        int start =0;
        int end= nums.length-1;
        
        int ans =-1;
        
        
        while(start<=end){
            int mid= start +(end - start)/2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid]> target){
                end = mid - 1;
            }else{
                ans=mid;
                if(findStartIndex== true){
                    end= mid-1;
                }else{
                    start= mid+1;
                }
            }
        }
        return ans;
    }
}

*/