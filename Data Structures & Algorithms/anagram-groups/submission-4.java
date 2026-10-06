class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answers = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] freq = new int[26];

            for(int x = 0; x < strs[i].length(); x++){
                char cur = strs[i].charAt(x);
                freq[cur - 'a'] = freq[cur - 'a'] + 1;
            }

            String freqStr = Arrays.toString(freq);
            
            if(map.get(freqStr) != null){
                map.get(freqStr).add(strs[i]);
            }else{
                List<String> anagramGroup = new ArrayList<>();
                map.put(freqStr, anagramGroup);
                map.get(freqStr).add(strs[i]);
            }

        }

        for(List<String> group: map.values()){
            answers.add(group);
        }

        return answers;
    }
}
