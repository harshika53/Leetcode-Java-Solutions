class Solution {
    public int[] dailyTemperatures(int[] temp) {
      Stack<Integer> st = new Stack<>();
      int ans[] = new int[temp.length];
      for(int i=0; i<temp.length; i++){
      //ckeck if stack is empty
        while(!st.isEmpty() && temp[st.peek()]<temp[i]){
            int idx =st.pop();
             ans[idx] = i-idx;
        }
        st.push(i);
      }
      while(!st.isEmpty()){
        int idx = st.pop();
        ans[idx] =0;
      }
      return ans;
    }
}