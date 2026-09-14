class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 0);
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(Integer num : map.keySet()){
            queue.add(num);
        }

        while(queue.size() > k){
            queue.poll();
        }

        Iterator<Integer> it = queue.iterator();
        int[] answer = new int[k];

        for(int i = 0; i < k; i++){
            answer[i] = it.next();
        }

        return answer;
    }
}

//hashmap to store shit (num, freq)
//priorityqueue map.get
