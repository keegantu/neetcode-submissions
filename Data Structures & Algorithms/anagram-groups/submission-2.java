class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> answers = new ArrayList<>();
        
    // creates number map
        for(int i = 0; i < strs.length; i++){
            int[] letters = new int[26];
            String currentStr = strs[i];

            for(int j=0; j <currentStr.length(); j++){
                letters[currentStr.charAt(j) - 'a']++;
            }

            String lettersKey = Arrays.toString(letters);

            
    // finds match if exists
            if(map.get(lettersKey) != null){
                answers.get(map.get(lettersKey)).add(currentStr);
            }else{
                map.put(lettersKey, answers.size());

                List<String> subList = new ArrayList<>();
                subList.add(currentStr);
                
                answers.add(subList);
            }

        }
        return answers;
        
    }
}



