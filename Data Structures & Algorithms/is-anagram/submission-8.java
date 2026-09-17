class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
                map.put(sChar, map.getOrDefault(sChar, 0) + 1);
                map.put(tChar, map.getOrDefault(tChar, 0) - 1);
        }

        for(int i : map.values()){
            System.out.println(i);
            if(i != 0) return false;
        }

        return true;
    }
}
