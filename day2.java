import java.util.Arrays;
import java.util.Scanner;
import javax.swing.text.TabableView;

public class day2 {
    /* 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numbers[]= new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }



     //   swap(arr, 0 ,3);
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    static void reverse(int [] numbers){
        int start=0;
        int end= numbers.length-1;
        while(start<end){
            swap(numbers, start, end);
            start++;
            end--;
        }
    }
    static void swap(int [] numbers ,int a, int b){
        int temp= numbers[a];
        numbers[a]=numbers[b];
        numbers[b]=temp;
    }

    









    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numbers[]= new int[5];
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
        }

        int max= maxElement(numbers);
        System.out.println((max));
    }

    
    static int maxElement(int[] numbers ){
        int max= numbers[0];
        for (int i =0; i<5;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }
   

    
    public static void main(String[] args) {
        String name= "Hello";
        char target = 'e';
        System.out.println(search(name, target));
    }

    static boolean search(String str , char target ){
        boolean search= false;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==target){
                search= true;
            }
        }

        return search;
    }
     




  
        public static void main(String[] args) {
            String name = "Tamanna";
            char target = 'm';
           // System.out.println(search(name, target));

           System.out.println(Arrays.toString(name.toCharArray()));
        }


        static boolean search(String str, char target){
            if(str.length()==0){
                return false;
            }

            for(char ch: str.toCharArray()){
                if(ch==target){
                    return true;
                }
            }

            for(int i =0; i<str.length();i++){
                if(target==str.charAt(i)){
                    return true;
                }
            }
            return false;
            }
        
    


    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=3;
        System.out.print(search(arr, target,1,4));

    }

    static boolean search(int arr[], int target, int start, int end){
        if(arr.length==0){
            return false;
        }

        for(int index=start; index <= end; index++){
           if(arr[index]==target){
            return true;
           }
        }
        return false;
    }

    */


    public static void main(String[] args) {
        int[] arr={18, 12,-7,3,14,28};
        System.out.println(minimum(arr));
    }
    

    static int minimum(int arr[]){
        int ans = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];

            }
        }
        return ans;
    }
}





    