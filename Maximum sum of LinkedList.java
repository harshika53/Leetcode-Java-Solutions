class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
         ListNode curr = head;
         while(curr != null){
            values.add(curr.val);
            curr = curr.next;
         }

         int maxsum = 0;
         int n= values.size();

         for(int i=0; i< n/2; i++){
          int sum = values.get(i) + values.get(n - 1 - i);
            maxsum = Math.max(maxsum, sum);
         }

         return maxsum;
    }
}