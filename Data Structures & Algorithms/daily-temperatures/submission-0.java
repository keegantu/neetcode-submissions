class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answers = new int[temperatures.length];
	
	    for(int i = 0; i < temperatures.length-1; i++){
	        int p = i+1;
	
            while(p < temperatures.length){
                if(temperatures[i] < temperatures[p]){
                    answers[i] = p-i;
                    break;
                }
                p++;

            }
	

        }

        return answers;

    }
}
