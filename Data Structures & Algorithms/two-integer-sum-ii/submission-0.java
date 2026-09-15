class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;
        int[] answer = new int[2];

        while(p1 <= p2){
            int curSum = numbers[p1] + numbers[p2];

            if(curSum == target){
                answer[0] = p1 + 1;
                answer[1] = p2 + 1;
                break;
            }else if(curSum > target){
                p2--;
            }else if (curSum < target){
                p1++;
            }
        }
        return answer;
    }
}

