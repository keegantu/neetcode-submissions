class Solution {
    public int lengthOfLongestSubstring(String s) {
        int p = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(p));
                    p++;
                }
                set.add(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
            max = Math.max(max, i-p+1);
        }

        return max;
    }
}
