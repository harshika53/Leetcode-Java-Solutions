class Solution {
    public int numSquares(int n) {
        if(n == 0) return 0;
        if(isSqrt(n)) return 1;
    
        for(int i=1; i<=Math.sqrt(n); i++){
            if(isSqrt(n-(i*i))) return 2;
        }
        
        while(n%4 ==0)
            n=n/4;
        
        if(n%8 == 7){
            return 4;    
        }

        return 3;
    }
    
    private boolean isSqrt(int n){
        int sqrt = (int)Math.sqrt(n);
        
        return n-(sqrt*sqrt)==0;
    }
}