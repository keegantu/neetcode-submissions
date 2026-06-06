class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] kList = new int[k];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a == b) { 
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        int index = 0;

        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                int curr = map.get(nums[i]);
                map.replace(nums[i], curr +1);
            }else{
                map.put(nums[i], 1);
                list.add(nums[i]);
            }

        }

        for(Integer i : list){
            int num = i;
            int freq = map.get(num);
            maxHeap.add(new int[]{num, freq});
        }

        for(int i = 0; i < k; i++){
            int[] pair = maxHeap.poll();
            kList[i] = pair[0];
        }

        return kList;

        
    }
}
