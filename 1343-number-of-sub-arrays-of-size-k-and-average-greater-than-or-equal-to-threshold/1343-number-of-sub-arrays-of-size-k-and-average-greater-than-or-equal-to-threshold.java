class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int min = Integer.MAX_VALUE;
        int sum = 0 ;
        int count =0 ;
        for( int i = 0 ; i < k ; i++){
            sum = sum +arr[i];
        }
        int avg = sum / k;
        if( avg >= threshold){
            count++;
        }
        for( int right = k ; right < arr.length ; right++){
            sum += arr[right] - arr[right - k];
            avg = sum / k;
            if( avg >= threshold){
             count++;
            }
        }
        return count ;
    }
}