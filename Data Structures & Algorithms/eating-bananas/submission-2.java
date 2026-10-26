class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max = -1;

        for(int i = 0; i < piles.length; i++){
                max = Math.max(max, piles[i]);
            }

        int left = 1;
        int right = max;
        int mid = (left+right)/2;
        int k = Integer.MAX_VALUE;


        while(left <= right){
            long count = 0;
            mid = (left+right)/2;

            for(int i = 0; i < piles.length; i++){
                count += Math.ceilDiv(piles[i], mid);
            }

            if(count > h){
                left = mid+1;
            }else{
                k = Math.min(k, mid);
                right = mid-1;
            }
        }

        return k;
    }
}
