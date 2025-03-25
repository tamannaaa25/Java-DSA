/*
 Count Vowels in a String
Write a program that counts the number of vowels (a, e, i, o, u) in a given string, regardless of
their case.
Example:
● Input: "Programming is fun!"
● Output: 6
 */
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0 ;i<str.length()-1;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
