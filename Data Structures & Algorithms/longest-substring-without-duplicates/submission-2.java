class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> map = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            int currentMax = 0;

            for(int k = i; k < s.length(); k++)
            if(!map.contains(s.charAt(k))){
                map.add(s.charAt(k));
                currentMax++;

                if(currentMax > max) max = currentMax;
            }else{
                map.clear();
                if(currentMax > max) max = currentMax;
                break;
            }

        }

        return max;
    }
}
