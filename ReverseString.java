/*
 Write a program that takes a string as input and reverses each word in the string while
maintaining the original order of the words.
Example:
● Input: "Hello World"
● Output: "olleH dlroW"
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        String res ="";
        for(int i= str.length()-1;i>=0;--i){
            res+=str.charAt(i);
        }
        System.out.print(res.toString().trim());
    }
}
