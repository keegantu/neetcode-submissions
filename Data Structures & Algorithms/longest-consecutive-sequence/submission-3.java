class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 1;

        if(nums.length == 0) return 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for(int i : set){
            int curLength = 1;
            int curNum = i;

            if(set.contains(curNum-1)){
                continue;
            
            }else{

                while(set.contains(curNum)){
                    if(set.contains(curNum+1)){
                        curLength++;
                    }else{
                        break;
                    }
                    curNum++;
                }

                longest = Math.max(longest, curLength);
            }

            
        }

        return longest;

    }
}
