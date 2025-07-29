class Solution {
    public String minWindow(String s, String t) {
        int winStart = 0, winEnd =0;
        int charCounter = t.length();
        String output = "";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for(int i=0; i < t.length(); i++){
            char c = t.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c,0) + 1);
        }
        while(winEnd < s.length()){
            if(charCountMap.containsKey(s.charAt(winEnd))) {
                if(charCountMap.get(s.charAt(winEnd)) > 0){
                    charCounter = charCounter - 1;
                }
                charCountMap.put(s.charAt(winEnd), charCountMap.get(s.charAt(winEnd))-1);
            }

            if(charCounter == 0){
                while(winStart <= winEnd){
                    if(charCountMap.containsKey(s.charAt(winStart))){
                        boolean isSubArrayStillValid = charCountMap.get(s.charAt(winStart)) + 1 <= 0 ? true : false;
                        if(isSubArrayStillValid){
                            charCountMap.put(s.charAt(winStart), charCountMap.get(s.charAt(winStart)) + 1);
                            winStart++;
                        } else{
                            break;
                        }
                    } else{
                        winStart++;
                    }
                }
                String temp = s.substring(winStart, winEnd + 1);
                if(output.isEmpty() || output.length() > temp.length()){
                    output = temp;
                }
            }
            winEnd++;
        }
        return output;
    }
}