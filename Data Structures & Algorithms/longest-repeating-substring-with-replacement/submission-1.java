class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int p = 0;
        int max = 0;
        char mostFreq = s.charAt(0);
        int replacements = 0;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

            if(map.get(s.charAt(i)) > map.get(mostFreq)){
                mostFreq=s.charAt(i);
            }

            replacements = (i - p + 1) - map.get(mostFreq);

            if(replacements > k){
                map.put(s.charAt(p), map.get(s.charAt(p)) - 1);
                p++;
            }

            max = Math.max(max, i-p+1);

        }

        return max;



    }
}

// p goes before i 
// replace chars with most freq char in substring
// replacements = length of substring - num of mostfreqchars


