class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = nums.length+1;
        int curSum = 0;
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            curSum += nums[i];

            while(curSum >= target){
                minLen = Math.min(minLen, i-j+1);
                curSum -= nums[j];
                j++;
                
            }
        }
        
        if(minLen == nums.length+1) return 0;
        return minLen;
    }
}