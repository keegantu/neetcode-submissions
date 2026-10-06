class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];

        for(int i = 0; i <nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(map.get(a), map.get(b)));

        for(int num : map.keySet()){
            queue.add(num);
        }

        while(queue.size() > k){
            queue.poll();
        }

        
        for(int i = 0; i < k; i++){
            answer[i] = queue.poll();
        }

        return answer;

        
    }
}
