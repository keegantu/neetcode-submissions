class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] topK = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
            
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, (a,b) ->              freq.get(a)-freq.get(b));

        for(Integer x : freq.keySet()){
            minHeap.add(x);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        
        for(int i = 0; i < k; i++){
            topK[i] = minHeap.poll();
        }

        return topK;




    }
}
