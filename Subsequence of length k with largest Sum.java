class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] numsIndices = new int[nums.length][2];
        for(int i=0; i< nums.length; i++){
            numsIndices[i] = new int[]{nums[i], i};
        }
        Arrays.sort(numsIndices, (a, b) -> b[0] - a[0]);
        Arrays.sort(numsIndices, 0, k, (a, b) -> a[1] - b[1]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
           result[i] = numsIndices[i][0];
      }
      return result;
    }
}