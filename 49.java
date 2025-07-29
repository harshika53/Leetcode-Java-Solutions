class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> freqStringsMap = new HashMap<>();
        for(String str : strs){
            String frequencyString = getFrequencyString(str);
            if(freqStringsMap.containsKey(frequencyString)){
                freqStringsMap.get(frequencyString).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                freqStringsMap.put(frequencyString, strList);
            }
        }
        return new ArrayList<>(freqStringsMap.values());
    }
    private String getFrequencyString(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }
        StringBuilder frequencyString = new StringBuilder("");
        char c ='a';
        for(int i : freq){
            frequencyString.append(c);
            frequencyString.append(i);
            c++;
        }
        return frequencyString.toString();
    }
}