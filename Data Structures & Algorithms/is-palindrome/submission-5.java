class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length()-1;

        String cs = s.toLowerCase();

        while(p1 < p2){

            while(p1<p2 && !(Character.isLetterOrDigit(cs.charAt(p1)))){
                p1++;
            }

            while(p1<p2 && !(Character.isLetterOrDigit(cs.charAt(p2)))){
                p2--;
            }

            if(cs.charAt(p1) != cs.charAt(p2)){
                return false;
            }

            p1++;
            p2--;

        }

        return true;


        
    }
}
