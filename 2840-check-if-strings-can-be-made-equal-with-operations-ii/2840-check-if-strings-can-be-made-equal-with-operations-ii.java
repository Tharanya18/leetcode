class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] oddarr1 = new int[26];
        int[] evenarr1= new int[26];
        int[] oddarr2 = new int[26];
        int[] evenarr2 = new int[26];
        if (s1.length()!=s2.length())
           return false;

        for ( int i=0 ; i < s1.length() ; i++)
        {
          char ch1 = s1.charAt(i);
          if( i % 2 == 0)
            evenarr1[ch1 - 'a']++;
          else
            oddarr1[ch1 - 'a']++;
        }

        for ( int i=0 ; i < s2.length() ; i++)
        {
          char ch2 = s2.charAt(i);
          if( i % 2 == 0)
            evenarr2[ch2 - 'a']++;
          else
            oddarr2[ch2 - 'a']++;
        }

        for( int i =0 ; i< 26 ;i++)
        {
            if ( evenarr1[i]!= evenarr2[i] || oddarr1[i]!=oddarr2[i])
            return false;
        }

        return true;
    }
}