class Solution {
    public void nextPermutation(int[] nums) {
        // Step 1: Find pivot
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break; // ✅ very important to break after finding first such i
            }
        }

        // Step 2: If no pivot, reverse the entire array
        if (pivot == -1) {
            int start = 0;
            int end = nums.length - 1;
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            return;
        }

        // Step 3: Find the rightmost successor to pivot and swap
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // Step 4: Reverse the subarray after pivot
        int start = pivot + 1;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
