class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] kList = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) { 
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int x = (map.get(nums[i]) + 1);
                map.replace(nums[i], x);
            }else{
                map.put(nums[i], 1);
            }
        }

        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
   
            maxHeap.add(new int[]{entry.getKey(), entry.getValue()});
        }
            

            
        

        int[] current = new int[2];
        for(int i = 0; i < k; i++){
            current = maxHeap.poll();
            kList[i] = current[0];
        }

        return kList;


    }
}
