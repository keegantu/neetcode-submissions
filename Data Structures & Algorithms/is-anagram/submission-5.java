class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        
        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char curS = s.charAt(i);
            if(sMap.get(curS) == null){
                sMap.put(curS, 1);
            }else{
                int curCount = sMap.get(curS);
                sMap.replace(curS, curCount+1);
            }
            
            char curT = t.charAt(i);
            if(sMap.get(curT) == null){
                sMap.put(curT, -1);
            }else{
                int curCount = sMap.get(curT);
                sMap.replace(curT, curCount-1);
            }
        }

        for(Integer value: sMap.values()){
            if (value != 0) return false;
        }
        

        return true;

    }
}
