class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       StringBuilder sb = new StringBuilder();

       for( String word : words){
         int sum = 0 ;
         for( int i = 0 ; i < word.length() ; i++)
         {
            char ch = word.charAt(i);
            int index = ch - 'a';
            sum += weights[index];
         }
         int mod = sum % 26;
        
         sb.append( (char) ('z' - mod));
       }

       return sb.toString();
    }
}