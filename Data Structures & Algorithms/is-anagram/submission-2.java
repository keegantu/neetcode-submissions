class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(sMap.get(cur) == null){
                sMap.put(cur, 1);
            }else{
                int curCount = sMap.get(cur);
                sMap.replace(cur, curCount+1);
            }
        }


        for(int i = 0; i < t.length(); i++){
            char cur = t.charAt(i);
            if(tMap.get(cur) == null){
                tMap.put(cur, 1);
            }else{
                int curCount = tMap.get(cur);
                tMap.replace(cur, curCount+1);
            }
        }

        return sMap.equals(tMap);

    }
}
