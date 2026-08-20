class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq =  new int[26];
       int left = 0 ;
       int maxfreq = 0;
       int ans = 0 ;
       for( int right = 0 ; right < s.length() ; right++){
        int index = s.charAt(right) - 'A';
        freq[index]++;

        maxfreq = Math.max(maxfreq , freq[index]);
        int windowlength = right - left +1;
        int changes = windowlength - maxfreq;
        while( changes > k ){
            freq[s.charAt(left) -'A']--;
            left++;

            windowlength = right - left+ 1;
            changes = windowlength - maxfreq;
        }
        ans = Math.max(ans , right-left +1);
       }
       return ans; 
    }
}