class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];

            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String current = Arrays.toString(count);

            if(map.containsKey(current)){
                map.get(current).add(s);
            }else{
                List<String> bucket = new ArrayList<>();
                bucket.add(s);
                map.put(current, bucket);
            }
        }
        return new ArrayList<>(map.values());
    }
}
