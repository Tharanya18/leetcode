class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      int[] freq = new int[26];
      for( int i = 0 ; i < magazine.length() ; i++){
        char ch1 = magazine.charAt(i);
        int index1 = ch1 - 'a';
        freq[index1]++;
      }
      for( int j = 0 ; j < ransomNote.length() ; j++){
        char ch2 = ransomNote.charAt(j);
        int index2 = ch2 - 'a';
        if(freq[index2] == 0)
           return false;
           else
             freq[index2]--;
      }
      return true;
    }
}