class Solution {
    public int trap(int[] height) {
        int p1 = 0, p2 = height.length-1;
        int maxLeft = 0, maxRight = 0;
        int total = 0;

        while(p1 <= p2){
            if(maxLeft < maxRight){
                int curLeft = height[p1];
                maxLeft = Math.max(maxLeft, curLeft);
                total += maxLeft - curLeft;
                p1++;
            } else {
                int curRight=height[p2];
                maxRight = Math.max(maxRight, curRight);
                total += maxRight - curRight;
                p2--;
            }
        }

        return total;

    }
}
