class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        

        List<List<Integer>> answers = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            int p1 = i+1;
            int p2 = nums.length-1;

            if(i > 0 && nums[i] == nums[i-1]) continue;


            while(p1 < p2){
                int curSum = nums[p1] + nums[p2];


                if(i != p1 && i != p2 && (curSum == -(nums[i]))){
                    
                    List<Integer> trip = new ArrayList<>();
                    trip.add(nums[i]);
                    trip.add(nums[p1]);
                    trip.add(nums[p2]);
                    answers.add(trip);

                    p1++;
                    p2--;

                    while(p1<p2 && nums[p1 - 1] == nums[p1]){
                        p1++;
                    }

                    while(p2>p1 && nums[p2 + 1] == nums[p2]){
                        p2--;
                    }

                }else if(curSum > -(nums[i])){
                    p2--;
                }else if(curSum < -(nums[i])){
                    p1++;
                }
            }
        }

        return answers;
        
    }
}
