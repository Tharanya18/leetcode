class Solution {
    public int compress(char[] chars) {
       int i = 0 ;
       int write = 0 ;
       while (i < chars.length){

        char current = chars[i];
        int count = 0;
        while( i < chars.length && chars[i]==current)
         {
            count++;
            i++;
         }

         chars[write] = current;
         write++;

         if(count > 1)
         {
            String cnt  =  String.valueOf(count);
            for( char ch : cnt.toCharArray()){
                     chars[write]=ch;
                     write++;
            }
         }
       }
       return write;
    }
}