class Solution {
    public String reverseOnlyLetters(String s) {
        int left  = 0 , right  = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(left < right){
            if(Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right))){
                char temp = s.charAt(left);
                sb.setCharAt(left , s.charAt(right));
                sb.setCharAt(right , temp);
                left++;
                right--;
            }
            else if(!Character.isLetter(sb.charAt(left)) && Character.isLetter(sb.charAt(right))){
                left++;
            }
            else if(Character.isLetter(sb.charAt(left)) && !Character.isLetter(sb.charAt(right))){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return sb.toString();
    }
}