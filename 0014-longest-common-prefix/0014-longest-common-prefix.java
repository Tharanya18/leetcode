class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
         String s = strs[0];
        for( int i = 0 ; i < s.length() ; i++){
            boolean istrue = false;
            char ch = s.charAt(i);
            for( int j = 0 ; j < strs.length-1 ; j++){
                if (i >= strs[j+1].length()) {
                    istrue = true;
                    break;
                }
                if(ch==strs[j+1].charAt(i))
                    continue;
                else{
                   istrue =true;
                   break;
                }
            }
            if( !istrue)
               sb.append(ch);
            else
               break;
        }
        return sb.toString();
    }
}