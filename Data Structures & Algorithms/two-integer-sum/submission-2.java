class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for(int i = 0; i<nums.length; i++){
            int cur = nums[i];
            int curTarget = target - cur;
            

            
            
            if(map.containsKey(curTarget)){
                answer[1] = i;
                answer[0] = map.get(curTarget);
                return answer;
            }

            map.put(cur, i);
            
        }

        
        return answer;
    }
}
