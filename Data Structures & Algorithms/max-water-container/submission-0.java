class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length-1;
        int maxArea = 0;

        while(p1 < p2){

            int curArea = Math.min(heights[p1], heights[p2]) * (p2-p1);
            if(curArea > maxArea) maxArea = curArea;

            if(heights[p1] > heights[p2]){
                p2--;
            }else{
                p1++;
            }

        }

        return maxArea;


    }
}

//equation = Math.min(heights[p1], heights[p2]) * (p2-p1)

