class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){
            int curTarget = target - nums[i];
            if(map.get(curTarget) != null){
                answer[0] = map.get(curTarget);
                answer[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return answer;
    }

    
}
