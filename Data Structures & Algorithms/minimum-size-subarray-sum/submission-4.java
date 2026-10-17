class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p = 0;
        int curSum = 0;
        int minLength = nums.length+1;

        for(int i = 0; i < nums.length; i++){
            curSum+= nums[i];

            while(curSum >= target){
                minLength = Math.min(minLength, i - p + 1);
                curSum -= nums[p];
                p++;
                
            }
            
        }

        if(minLength == nums.length+1){
            return 0;
        }else{
            return minLength;
        }
    }
}

