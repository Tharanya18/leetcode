class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max = -1;
       int n = candies.length;
       List<Boolean> boolArray = new ArrayList<>();
       for( int candy : candies){
        max = Math.max(max ,candy);
       }
       for( int i = 0 ; i < n ; i++)
       {
         int temp = candies[i] + extraCandies;
         if ( temp >= max )
         {
           boolArray.add(i , true);
         }
         else{
             boolArray.add(i , false);
         }
       } 
       return boolArray;

    }
}

 