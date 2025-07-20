class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+nums2.length];
        for(int i=0; i<nums1.length; i++){
            merged[i] = nums1[i]; 
        }
        for(int j=0; j<nums2.length; j++){
            merged[nums1.length+j] = nums2[j];
        }
        Arrays.sort(merged);
        int x = merged.length;
        double median=0;
        if(x%2==0){
             median = ((double)merged[(x/2)-1]+merged[x/2]) /2;
        }else{
            median = merged[x/2];
        }
        return median;
    }
}