class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int [] arr = new int[n];

        int index = -n;

        for( int i =0;i< n ;i++)
        {
            if(s.charAt(i)== c)
            {
                index = i;
            }
            arr[i]= Math.abs(i -index);
        }

         index = 2*n;
        for ( int i=n-1 ; i>=0 ;i--)
        {
          if(s.charAt(i)== c)
            {
                index = i;
            }
            arr[i]= Math.min(arr[i],Math.abs( i- index));   

        }
        return arr;
    }
}