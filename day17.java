public class day17 {
    public static void main(String s) {
        String[] words= s.trim().split("");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0;i--){
            if(words.length[i]>0){
                sb.append(words[i]);
                sb.append(' ');
            }
        }
        return sb.substring(0,sb.length()-1).toString();
    }


//palindrome 125
    public boolean isPalindrome(String s) {
        
        StringBuilder sb= new StringBuilder();
        
        for( char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        
        return sb.toString().equals(sb.reverse().toString());
    }
}


