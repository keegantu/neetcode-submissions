class Solution {
    public boolean isPalindrome(String s) {
        

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        cleaned = cleaned.toLowerCase();

        int p1 = 0;
        int p2 = cleaned.length()-1;

        

        while(p1 < p2){
            if(cleaned.charAt(p1) != cleaned.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }

        return true;
    }
}
