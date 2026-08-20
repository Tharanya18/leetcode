class Solution {
    public long minimumSteps(String s) {
        char[] arr = s.toCharArray();
        int i = 0 ;
        int j = arr.length -1;
        long sol = 0 ;
        while( i < j ){
            while(i < j && arr[i]== '0')
               i++;
            while( i < j && arr[j] == '1')
              j--;

            if( i < j){
                sol += j-i;
                i++;
                j--;
            }
        }
        return sol;
    }
}