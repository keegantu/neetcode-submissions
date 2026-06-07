class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high)/2;

        while(low <= high){
            mid = (low + high)/2;
            if(nums[mid] == target) return mid;

            //right sorted
            if(nums[mid] < nums[high]){
                //if target is in right half we narrow to right side
                if((nums[mid] < target) && (target <= nums[high])){
                    low = mid+1;
                }else{
                // if not we narrow to left side
                    high = mid-1;
                }

            //if right not sorted then left half sorted check if target is in left
            }else if((target <= nums[mid]) && (target >= nums[low])){
                //if it is we narrow to left side
                high = mid-1;
            }else{
                //if not it is in right
                low = mid+1;
            }
        }
        
        return -1;
    }
}
