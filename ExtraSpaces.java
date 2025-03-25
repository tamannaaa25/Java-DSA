/*
 Write a program that takes a string as input and removes any extra spaces between words,
ensuring that only a single space exists between them. Also, trim any leading or trailing spaces.
Example:
● Input: " Hello World "
● Output: "Hello World"
 */
import java.util.Scanner;
public class ExtraSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ' && str.charAt(i+1)==' '){
                continue;
            }
            else{
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString().trim());
    }
}
