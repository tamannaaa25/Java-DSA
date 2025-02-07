public class day11 {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            else{
                n=n/2;
            }
        }
        return true;
    }

    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%3!=0){
                return false;
            }else{
                n=n/3;
            }
        }
        return true;
    }

    
}

