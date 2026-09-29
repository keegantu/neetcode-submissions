class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int max = 0;
        int[] freq = new int[26];
        int[] freq2 = new int[26];

        if(s1.length() > s2.length()) return false;

        
        for(int i = 0; i < s1.length(); i++){
            char cur = s1.charAt(i);
            freq[cur - 'a'] = freq[cur - 'a'] + 1;
        }

        String freqStr = Arrays.toString(freq);

        for(int i = 0; i < s1.length(); i++){
            char cur = s2.charAt(i);
            freq2[cur - 'a'] = freq2[cur - 'a'] + 1;
        }

        if(freqStr.equals(Arrays.toString(freq2))) return true;

        for(int i = s1.length(); i < s2.length(); i++){
            char cur = s2.charAt(i);
            char curP = s2.charAt(i - s1.length());

            freq2[cur - 'a'] = freq2[cur - 'a'] + 1;
            freq2[curP - 'a'] = freq2[curP - 'a'] - 1;
            String freq2Str = Arrays.toString(freq2);

            if(freqStr.equals(freq2Str)) return true;



        }

        return false;
    }
}






