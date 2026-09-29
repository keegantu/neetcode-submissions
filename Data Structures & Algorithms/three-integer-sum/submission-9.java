class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> trips = new ArrayList<>();
        

        for(int i = 0; i < nums.length-1; i++){
            int p1 = i+1;
            int p2 = nums.length-1;

            if(i>0 && nums[i] == nums[i-1]) continue;

            while(p1 < p2){
                if(-nums[i] == (nums[p1] + nums[p2])){
                    List<Integer> newTrip = new ArrayList<>();
                    newTrip.add(nums[i]);
                    newTrip.add(nums[p1]);
                    newTrip.add(nums[p2]);
                    trips.add(newTrip);
                    p1++;
                    p2--;

                    while(p1 < p2 && nums[p1] == nums[p1-1]){
                        p1++;
                    }

                    while(p1 < p2 && nums[p2] == nums[p2+1]){
                        p2--;
                    }
                }else if(-nums[i] > (nums[p1] + nums[p2])){    
                    p1++;
                }else{
                    p2--;
                }

                
            }
        

        }
        return trips;
        
    }
}


