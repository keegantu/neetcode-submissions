class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.get(target-nums[i]) != null){
                answer[0] = map.get(target-nums[i]);
                answer[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return answer;

        
    }
}
