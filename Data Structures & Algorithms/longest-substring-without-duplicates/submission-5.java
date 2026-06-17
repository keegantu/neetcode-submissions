class Solution {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Character> set = new Hashtable<>();
        int max = 0;
        int l=0;
        int r=0;

        while((l <= r) && (r < s.length())){
            if(!set.containsKey(s.charAt(r))){
                set.put(s.charAt(r), s.charAt(r));
                r++;
                max = Math.max(max, r - l);
            }else{
                while(set.containsKey(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.put(s.charAt(r), s.charAt(r));
                r++;
            }
        }
        return max;

    }
}
