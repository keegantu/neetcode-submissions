class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStrBuilder = new StringBuilder();

        for(String i : strs){
            encodedStrBuilder.append(i.length() + "#" + i);
        }

        String encodedStrs = encodedStrBuilder.toString();

        return encodedStrs;


    }

    public List<String> decode(String str) {
        List<String> decodedStrs = new ArrayList<>();
        int index = 0;

        while(index < str.length()){
            StringBuilder strLengthBuilder = new StringBuilder();

            while(str.charAt(index) != '#'){
                strLengthBuilder.append(str.charAt(index));
                index++;
            }

            int strLength = Integer.parseInt(strLengthBuilder.toString());

            decodedStrs.add(str.substring(index+1, index+strLength+1));

            index +=strLength+1;

        }

        return decodedStrs;



    }
}


//to encode we need to add # then number after for every string