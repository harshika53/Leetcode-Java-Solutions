class Solution {
    public int[] countBits(int n) {
         int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int num = i;
            int bits = 0;

            while (num != 0) {
                bits += num & 1;
                num = num >> 1;
            }
            result[i] = bits;
        }
        return result;
        
    }
}