class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;
        

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(int i = 0; i < s1.length(); i++){
            char curChar = s1.charAt(i);
            s1Freq[curChar - 'a'] = s1Freq[curChar - 'a'] + 1;
        }
        String s1FreqString = Arrays.toString(s1Freq);

        
        for(int i = 0; i < s1.length(); i++){
            char curChar = s2.charAt(i);
            s2Freq[curChar - 'a'] = s2Freq[curChar - 'a'] + 1;
        }

        int p1 = 0;
        int p2 = s1.length()-1;

        while(p2 < s2.length()-1){
            if(s1FreqString.equals(Arrays.toString(s2Freq))){
                return true;
            }else{
                s2Freq[s2.charAt(p1) - 'a'] = s2Freq[s2.charAt(p1) - 'a'] - 1;
                s2Freq[s2.charAt(p2+1) - 'a'] = s2Freq[s2.charAt(p2+1) - 'a'] + 1;
            }
            p1++;
            p2++;

            if(s1FreqString.equals(Arrays.toString(s2Freq))) return true;
        }

        if(s1FreqString.equals(Arrays.toString(s2Freq))) return true;
        return false;
    }
}
