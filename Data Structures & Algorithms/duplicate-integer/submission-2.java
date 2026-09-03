class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int current = nums[i];

            if(map.get(current) != null){
                return true;
            }else{
                map.put(current, 1);
            }
        }

        return false;

    }
}