import java.util.Arrays;

public class day3 {
    /* 
    public static void main(String[] args) {
        int[][] arr= {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };
        int target =56;
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

        static int[] search(int[][] arr, int target){
            for(int row=0;row<arr.length;row++){
                for(int col=0;col<arr[row].length;col++){
                    if(arr[row][col]==target){
                        return new int[]{row,col};
                    }
                }
            }
            return new int[]{-1,-1};
        
    }










    
        public int findNumbers(int[] nums) {
             int count =0;
             
            for(int i=0; i<(nums.length);i++){
                int n=nums[i];
                int digit=0;
                while(n>0){
                    n=n/10;
                    digit++;
                }
    
               
                if(digit%2==0){
                    count++;
                }
                
            }
            return count;
        }
    



   
        public int maximumWealth(int[][] accounts) {
            int ans= Integer.MIN_VALUE;
            //person=row, account=col
            for(int person=0; person<accounts.length;person++){
                int sum=0;
            
                for(int account=0; account<accounts[person].length; account++){
                    sum+=accounts[person][account];
                }
    
            if(sum>ans){
                ans=sum;
                }
            }
            return ans;
        
    }



*/

}
