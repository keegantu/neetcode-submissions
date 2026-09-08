class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int l = s.length();
        int[] sMap = new int[26];

        for(int i = 0; i<l; i++){
            sMap[s.charAt(i) - 'a'] = sMap[s.charAt(i) - 'a'] + 1;
        }

        String sMapStr = Arrays.toString(sMap);

        int[] tMap = new int[26];

        for(int i = 0; i<l; i++){
            tMap[t.charAt(i) - 'a'] = tMap[t.charAt(i) - 'a'] + 1;
        }

        String tMapStr = Arrays.toString(tMap);

        return sMapStr.equals(tMapStr);

    }

}
