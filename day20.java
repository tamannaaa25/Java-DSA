//GEEKS FOR GEEKS 20 EASY QUESTIONS ON BINARY SEARCH
//{ Driver Code Starts
/* 
import java.util.*;

1))))))))))))
// } Driver Code Ends

// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        
        for(int i =0; i <arr.length ; i++){
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.firstIndex(arr));
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends



2)))))))))))))))

//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.searchInSorted(arr, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean searchInSorted(int arr[], int k) {
        for(int i=0; i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
}


3))))))))

//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findMaximum(arr);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        int start =0;
        int end= arr.length-1;
        
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(arr[mid]>arr[mid+1]){
                end= mid;
            }
            else{
                start= mid+1;
            }
        }
        
        return arr[start];
    }
}


4))))))

//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            int[] nums = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                nums[i] = Integer.parseInt(tokens[i]);
            }
            Solution ob = new Solution();
            int res = ob.findMagicalNumber(nums);

            System.out.println(res);
        }
        sc.close();
    }
}

// } Driver Code Ends



class Solution {
    public int findMagicalNumber(int[] arr) {
        for(int i =0; i<arr.length; i++){
            if(arr[i]==i){
                return i;
            }
        }
        return -1;
    }
}

*/

