class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while(p1 <= p2){
            char cur1 = s.charAt(p1);
            char cur2 = s.charAt(p2);

            if(!(Character.isLetterOrDigit(cur1)) && !(Character.isLetterOrDigit(cur2))){
                p1++;
                p2--;
                continue;
            }else if(!(Character.isLetterOrDigit(cur1))){
                p1++;
                continue;
            }else if(!(Character.isLetterOrDigit(cur2))){
                p2--;
                continue;
            }else{
                Character cleanCur1 = Character.toLowerCase(cur1);
                Character cleanCur2 = Character.toLowerCase(cur2);
                if(!(cleanCur1 == cleanCur2)) return false;
            }

            p1++;
            p2--;
            
            
        }

        return true;
    }
}



