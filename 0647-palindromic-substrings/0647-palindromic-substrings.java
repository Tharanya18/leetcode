class Solution {
     public boolean checkpalindrome(String st){
        int l = 0 , r = st.length()-1;
        {
            while(l < r){
                if(st.charAt(l) != st.charAt(r))
                   return false;

                l++;
                r--;
            }
            return true;
        } 
    }
    public int countSubstrings(String s) {
        int count = 0;
        for(int left = 0 ; left < s.length() ; left++){
         for( int right = left ; right < s.length() ; right++){
            String str = s.substring(left , right+1);
            if(checkpalindrome(str)){
               count++;
            }
        }
        }
        return count;
    }
}