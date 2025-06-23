class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> freq = new HashMap<>();
      for (int num : nums){
        freq.put(num, freq.getOrDefault(num, 0)+ 1);
      }
      
      List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freq.entrySet());
      freqList.sort((a,b) -> b.getValue().compareTo(a.getValue()));
 
      int[] result = new int[k];
      for(int i=0; i<k; i++){
        result[i] = freqList.get(i).getKey();
      }
      
      return result;
    }
}