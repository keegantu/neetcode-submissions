class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i <nums.length; i++){
            set.add(nums[i]);
        }

        for(Integer num : set){
            
            if(!(set.contains(num-1))){
                int currentMax = 1;
                int currentNum = num;

                while(true){
                    if(set.contains(currentNum+1)){
                        currentMax++;
                        currentNum++;
                    }else{
                        break;
                    }
                }
                if(currentMax > max) max = currentMax;

            }
        }

        return max;




    }
}

//check if num-1 exists. if so, skip
// if not, look for the next number


