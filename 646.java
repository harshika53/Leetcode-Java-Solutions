class Solution {
    public int findLongestChain(int[][] pairs) {
          
    Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
    int memo[] = new int[pairs.length];
    Arrays.fill(memo, -1);
    int res = helper(pairs, 0, Integer.MIN_VALUE, memo);
    return res;
}

public int helper(int pairs[][], int idx, int prevPairStartingVal, int memo[]){
    
    if(idx >= pairs.length){
        return 0;
    }
    
    if(memo[idx]!=-1)
        return memo[idx];
    
    int include = 0,  skip =0;
    if(pairs[idx][0] > prevPairStartingVal){
        include = 1 + helper(pairs,idx+1,pairs[idx][1],memo);
    }
    skip = helper(pairs, idx+1, prevPairStartingVal,memo);
    
    memo[idx] = Math.max(include, skip);
    return memo[idx];
}

}