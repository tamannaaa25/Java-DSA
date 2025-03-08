/*
 import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int bubbleSort(int[] arr, int n){
        int swapCount = 0;
        for(int i=0; i<n-1;i++){
          for(int j=0; j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapCount++;
                }
            }
        }
        return swapCount;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(bubbleSort(arr , n));
            T--;
        }
    }
}




import java.util.Scanner;

class Main{
    public static int selectionSort(int[] arr, int n){
        int swap=0;
        for(int i=0; i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp= arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                swap++;
            }
        }
        return swap;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(selectionSort(arr , n));
            T--;
        }
    }
}

#912

class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}


//75

class Solution {
    public void sortColors(int[] nums) {
        int count0=0; 
        int count1=0; 
        int count2=0;

        for(int num : nums){
            if(num==0){
                count0++;
            }else if(num==1){
                count1++;
            }else{
                count2++;
            }
        }

        int i=0;
        while(count0-->0)
        nums[i++]=0;
        while(count1-->0)
        nums[i++]=1;
        while(count2-->0)
        nums[i++]=2;
    }
}



 */