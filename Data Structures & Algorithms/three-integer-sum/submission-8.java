class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answers = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && (nums[i] == nums[i-1])) continue;
            int curTarget = -(nums[i]);
            int p1 = i+1;
            int p2 = nums.length - 1;

            while(p1 < p2){

                if(nums[p1]+nums[p2] == curTarget){

                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[p1]);
                    list.add(nums[p2]);
                    answers.add(list);
                    p1++;
                    p2--;

                    while(p1 < p2 && nums[p1] == nums[p1-1]) p1++;
                    while(p1 < p2 && nums[p2] == nums[p2+1]) p2--;
                }else if(nums[p1]+nums[p2] > curTarget){
                    p2--;
                }else{
                    p1++;
                }

            }

        }
        return answers;
    }
}
