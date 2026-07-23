class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for( int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch -'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for( int i = 0 ; i < order.length() ; i++){
            char c = order.charAt(i);
            while(freq[c - 'a'] != 0){
              sb.append(c);
              freq[c - 'a']--;
            }
        }
        for( int i = 0 ; i < s.length() ; i++){
            char letter = s.charAt(i);
            if(freq[letter - 'a'] != 0 )
               sb.append(letter);
        }
         return sb.toString();
    }
}