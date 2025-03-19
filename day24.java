/*
 * Write a function to count and print the number of digits in a positive integer. 
Complete the function countDigits() that accepts a number and returns the number of digits in it.
Input Format
The first line consists of number of testcases, T
Next T lines contains an integer whose numbers of digits is to be found
Output Format
For each test case print the number of digit in that number in a new line
Sample Input
1
12345
Sample Output
5
 

public class day24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
            int num=sc.nextInt();
            System.out.print(countDigits(num));
        }
        sc.close();
    }

    public static int countDigits(int num){
        int count =0;
        int temp = num;
        while(temp>0){
            temp/=10;
            count++;
        }
        return count;
    }
}

*/

/*
 Write a program to calculate the amount using compound interest .
Input Format
Each test case contains three floating numbers denoting principle amount, rate and time.
Output Format
Print the amount upto 1(one) decimal point as shown below.
Sample Input
1000 5 2
Sample output
1102.5



public class day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float t=sc.nextFloat();

        double compound = p*Math.pow(1+r/100,t);
        System.out.printf("%.1f",compound);

        sc.close();
    }
    
}
 */

/* 
 Convert given number of seconds to days, hours, minutes and second bookmark_border
Given are number of seconds as an input , the task is to convert the given number of seconds to days, hours, minutes and seconds.
Complete the given functions to convert the given number of seconds to days, hours, minutes and seconds.
Input Format
The first line contains an integer, T , denoting the number of testcases
Then T lines follow, each consisting of an integer, the number of seconds
Output Format
For each testcase, print the number of days,hours,minutes,seconds.
Sample Input
1
128
Sample Output
0,0,2,8


import java.util.Scanner;

public class day24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int sec=sc.nextInt();
            printTime(sec);
        }
    }

  
        public static void printTime(int sec) {
            int days = getDays(sec);
            int hours = getHours(sec);
            int minutes = getMinutes(sec);
            int seconds = getSeconds(sec);
    
            System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        }
    
        public static int getDays(int sec) {
            return sec / (24 * 3600); // 1 day = 86400 seconds
        }
    
        public static int getHours(int sec) {
            return (sec % (24 * 3600)) / 3600; // Extract remaining hours after days
        }
    
        public static int getMinutes(int sec) {
            return (sec % 3600) / 60; // Extract remaining minutes after hours
        }
    
        public static int getSeconds(int sec) {
            return sec % 60; // Remaining seconds
        }
    
}

*/



