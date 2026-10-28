class TimeMap {
    Map<String, List<Container>> map = new HashMap<>();

    public TimeMap() {
        

        
    }
    
    public void set(String key, String value, int timestamp) {
        Container container = new Container(value, timestamp);

        if(!map.containsKey(key)){
            List<Container> list = new ArrayList<>();
            list.add(container);
            map.put(key, list);
        }else{
            map.get(key).add(container);
        }

    }
    
    public String get(String key, int timestamp) {
        
        if(!map.containsKey(key)) return "";

        List<Container> list = map.get(key);
        int low = 0;
        int high = list.size() - 1;
        int mid = (low+high)/2;
        String result = "";
        

        while(low <= high){
            mid = (low+high)/2;

            if(list.get(mid).timestamp <= timestamp){
                result = list.get(mid).value;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return result;


    }

    class Container {
        final int timestamp;
        final String value;

        Container(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    

    }
}
