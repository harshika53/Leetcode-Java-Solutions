class Solution {
    public int reversePairs(int[] nums) {
       int n = nums.length;
       return mergeSort(nums, 0, n-1);
    }

    private int mergeSort(int[] nums, int start, int end){
        if(start >= end){
            return 0;
        }
        int count =0;
        int mid = start + ( end - start )/2;

        count += mergeSort(nums, start, mid);
        count += mergeSort(nums, mid+1, end);
        count += merge(nums, start, mid, end);

       return count;
    }

    private int merge(int[] nums, int start, int mid, int end){
    int count = 0;

    int j = mid + 1;
    for (int i = start; i <= mid; i++) {
        while (j <= end && (long)nums[i] > 2L * nums[j]) {
            j++;
        }
        count += (j - (mid + 1));
    }

    int[] a = new int[end - start + 1];
    int index = 0;
    int i = start;
    j = mid + 1;

    while(i <= mid && j <= end){
        if(nums[i] <= nums[j]){
            a[index++] = nums[i++];
        } else {
            a[index++] = nums[j++];
        }
    }
    while(i <= mid){
        a[index++] = nums[i++];
    }
    while(j <= end){
        a[index++] = nums[j++];
    }

    System.arraycopy(a, 0, nums, start, end - start + 1);
    return count;
}
}

