class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        long x = 0 ; 
        long sum = 0 ;
        for( int i = 0 ; i < s.length() ; i++){
            int num = s.charAt(i) -'0';
            if( num != 0){
                x = x * 10 + num;
                sum = sum + num;
            }
        }
        return x * sum;
    }
}