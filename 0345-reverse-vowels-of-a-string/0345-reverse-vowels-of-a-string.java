class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0 , right = s.length()-1;
        while( left < right)
        {
            char ch1 = sb.charAt(left);
            char ch2 = sb.charAt(right);
            
            if( ("aeiouAEIOU" .contains(ch1 + "")) && ("aeiouAEIOU".contains(ch2 + "")))
            {
                char first = sb.charAt(left);
                sb.setCharAt(left , sb.charAt(right));
                sb.setCharAt(right , first);   
                left++;
                right--;
            }
            if(! "aeiouAEIOU".contains(ch1 + ""))
               left++;
            if(! "aeiouAEIOU".contains(ch2 + ""))
               right--;   
        }
        return sb.toString();
    }
}