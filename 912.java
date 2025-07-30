class Solution {
    public int[] sortArray(int[] nums) {
         quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    public void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = new Random().nextInt(high - low + 1) + low;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, high); 

        int i = low; 
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high); 
        quicksort(arr, low, i - 1);  
        quicksort(arr, i + 1, high); 
    }

    public void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
} 