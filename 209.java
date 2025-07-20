class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLenWindow = Integer.MAX_VALUE;
        int currWindow = 0;
       
        int low =0;
        int high =0;
        while(high < nums.length){
            currWindow += nums[high];
            high++;

        while(currWindow >= target){
           int currSize = high - low;
           minLenWindow = Math.min(minLenWindow, currSize);
           currWindow -= nums[low];
           low++; 
        }
    }
     return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}