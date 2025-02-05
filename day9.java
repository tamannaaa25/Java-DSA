import java.util.*;
public class day9 {
// main code (CYCLIC SORT)
    /* 
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
            }
        }
    

    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
        */

        // leet code 268

        /* 
        public static void main(String[] args){
            int[] arr={3,0,1};
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void sort(int[] arr){
            int i =0;
            
            while(i<arr.length){
                int correct = arr[i];
                if(arr[i]<arr.length && arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
            }

            for(int index=0; index<arr.length;index++){
                if(arr[index]!=index){
                    return index;
            }
        }
        return(arr.length);
    }
        static void swap(int[] arr, int first , int second){
            int temp= arr[first];
            arr[first]= arr[ second];
            arr[second]= temp;
        }

       //448 leet code

       public List<Integer> findDisappearedNumbers(int[] arr) {
       
        int i = 0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for(int index =0; index<arr.length ; index++){
            if(arr[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[ second];
        arr[second]= temp;
    }
        */

        /*
         leetcode 287

          public int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct =nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;
            }
        }

        for(int index=0; index<nums.length;index++){
            if(nums[index]!= index+1){
                return nums[index];
            }
        }
        return -1;
    }

    static void swap(int[] nums , int first , int second){
        int temp= nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
         */
}
