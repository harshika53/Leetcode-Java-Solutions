class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        int lucky =-1;
        for(int key : freq.keySet()){
            int count = freq.get(key);
            if(key == count){
                lucky = Math.max(lucky, key);
            }
        }
        return lucky;
    }
}