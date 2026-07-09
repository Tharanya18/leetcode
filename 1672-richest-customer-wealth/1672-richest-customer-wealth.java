class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int maximum = -1;
        for( int i = 0 ; i < n ;i++){
            int sum = 0;
            for( int j = 0 ; j < m ; j++){
                sum =sum + accounts[i][j];
                maximum = Math.max(maximum , sum);
            }
        }
        return maximum;
    }
}