import java.util.*;


public class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.println();
        String s = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 1;

        
        for (int i = 1; i < s.length(); i++) {
            
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
               
                result.append(s.charAt(i - 1)).append(count);
                count = 1; 
            }
        }


        result.append(s.charAt(s.length() - 1)).append(count);

       
        System.out.println(result.toString());

    }
}
