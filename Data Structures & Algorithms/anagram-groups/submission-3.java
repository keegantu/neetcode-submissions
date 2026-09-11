class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i< strs.length; i++){
            int[] freqMap = new int[26];

            for(int x = 0; x < strs[i].length(); x++){
                freqMap[(strs[i].charAt(x) - 'a')]++;
            }

            String freqStr = Arrays.toString(freqMap);

            if(map.get(freqStr) == null){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(freqStr, list);
            }else{
                map.get(freqStr).add(strs[i]);
            }

        }

        List<List<String>> answer = new ArrayList<>();

        map.forEach((key, value) -> {
            answer.add(value);
        });

        return answer;



    }
}


// use freq map string as key and list of strs as value
// 
