public class day12 {

    /* 
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){    
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }

    



    public static void main(String[] args) {
        int[] arr={3,2,1,18,9};
        System.out.println(linear(arr, 18, 0));
    }
    static boolean linear(int[] arr, int target, int index) {
        // Base case: if we've checked all elements and the target was not found
        if (index == arr.length) {
            return false;
        }
        
        // Check if the current element matches the target
        if (arr[index] == target) {
            return true;
        }
        
        // Recurse to check the next element
        return linear(arr, target, index + 1);
    }




    public int mySqrt(int n) {
        if(n==1 || n==0){
            return n;
        }
        
        int start =0;
        int end = n;
        
        while(start<=end){
            int mid = start + (end- start)/2;
            long midSquare = (long) mid * mid;
            if(n>midSquare){
                start = mid+1;
            }else if(n<midSquare){
                end= mid-1;
            }else{
                return mid;
            }
        }
        return end;
        
        
    }


    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
            num=num/2;
            count++;
        }else{
            num=num-1;
            count++;
            }
        }
        return count;
    }

    */
}
