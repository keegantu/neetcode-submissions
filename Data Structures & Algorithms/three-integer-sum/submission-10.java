class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();

        Arrays.sort(nums);
        int p1 = 1;
        int p2 = nums.length-1;

        for(int i = 0; i < nums.length-2; i++){
            p1 = i+1;
            p2 = nums.length-1;

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int currentTarget = -(nums[i]);
            while(p1 < p2){

                if(nums[p1] + nums[p2] == currentTarget){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[p1]);
                    list.add(nums[p2]);
                    answers.add(list);

                    while((p1<p2) && nums[p1] == nums[p1+1]){
                        p1++;
                    }
                    p1++;

                    while((p1<p2) && nums[p2] == nums[p2-1]){
                        p2--;
                    }
                    p2--;
                }else if(nums[p1] + nums[p2] < currentTarget){
                    while((p1<p2) && nums[p1] == nums[p1+1]){
                        p1++;
                    }
                    p1++;
                }else{
                    while((p1<p2) && nums[p2] == nums[p2-1]){
                        p2--;
                    }
                    p2--;
                }

            }
            

        }

        return answers;

    }
}
