class Solution {
    public int minimumCost(int[] cost) {
         Arrays.sort(cost);
        int count = 0 ;
        int totalcost = 0;
        for( int i = cost.length-1 ; i >=0 ; i--)
        {
           if ( count % 3 != 2)
           {
            totalcost += cost[i];
           }
           count++;
            
        } 
        return totalcost;
    }

}