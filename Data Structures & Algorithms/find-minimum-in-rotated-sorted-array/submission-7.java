class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        
        
        while(low < high){
            int mid = (low + high)/ 2;

                // case 1: right not sorted -> return right
            if(nums[mid] > nums[high]){
                low = mid + 1;
                // case 2: else (fully in order or left in order) -> return left
            }else{
                high = mid;
            }
        }

        return nums[low];
    }
}
