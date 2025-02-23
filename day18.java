public class day18 {
    //557 : reversing words in string 3. 
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb= new StringBuilder();
        
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse()).append(" "); 
        }
        
        return sb.toString().trim();
    }
}


//Hashmaps

public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int i =0; i<nums.length; i++){
        if(hm.containsKey(nums[i])){
            return true;
        }
        else{
            hm.put(nums[i],i);
        }
    } 
    return false;
}

public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }

    int[] count = new int [26];
    
    for(int i = 0 ; i<s.length() ; i++){
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }
    
    for(int num : count ){
        if(num!=0){
            return false;
        }
    }

    return true;
}