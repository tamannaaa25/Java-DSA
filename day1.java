import java.util.Scanner;

/* 

public class day1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && b>=c){
            System.out.println("A is the greatest");
        } else if (b>=c && b>=a) {
            System.out.println("B is the greatest");
        
        }else{
            System.out.println("C is the greatest");
        }
    }
}

*/


/* int max = Math.max(c,(Math.max(a,b))); 



public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        
        if(ch>='A' && ch<='Z'){
            ch = Character.toLowerCase(ch);
        }
        else{
            ch = Character.toUpperCase(ch);
        }

        System.out.println(ch);
    }
}




public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 ;
        int b=1;
        int count = 0;

        while(count <= n){
            int temp= a;
            a+=b;
            b=temp;
            count++;
        }
        System.out.println(a);
    }
}





public class day1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            int rem;
            while(a>0){
                rem=a%10;
                if(rem==b){
                    count++;
                }
                a=a/10;
            }
        System.out.println(count);
    }
}
    

public class day1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int rev=0;
        

        while(n>0){
            int rem = n%10;
            
            n=n/10;
            rev=rev*10+rem;
            
        
        }
        System.out.println(rev);
    }
}
    

public class day1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch(fruit){
            case "mango":
            System.out.println("King of fruits");
            break;
            case "apple":
            System.out.println("apol");
            break;
        }
    }
}
*/

