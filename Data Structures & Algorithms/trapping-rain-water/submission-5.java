class Solution {
    public int trap(int[] height) {
        int p1 = 1;
        int p2 = height.length-2;
        int sum = 0;
        int maxLeft = height[0];
        int maxRight = height[height.length-1];

        while(p1<=p2){
            if(maxLeft < maxRight){
                sum+= Math.max(maxLeft-height[p1], 0);
                maxLeft = Math.max(maxLeft, height[p1]);
                p1++;
            }else{
                sum+= Math.max(maxRight-height[p2], 0);
                maxRight = Math.max(maxRight, height[p2]);
                p2--;
            }
        }

        return sum;

    }
}
