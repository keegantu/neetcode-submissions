class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(freq.get(nums[i]) == null){
                freq.put(nums[i], 1);
            }else{
                int nextNum = freq.get(nums[i]);
                freq.put(nums[i], nextNum + 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));

        for (int key: freq.keySet()){
            pq.add(key);
        }

        for(int i = 0; i < k; i++){
            answer[i] = pq.poll();
        }

        return answer;




    }
}
