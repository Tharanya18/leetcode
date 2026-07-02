class Solution {
    public int findKthPositive(int[] arr, int k) {
     ArrayList<Integer> al = new ArrayList<>();
     int size = arr[arr.length-1]+k ;
     for( int i = 1 ; i <=size ; i++){
        boolean found = false;
        for( int j = 0 ; j < arr.length ; j++){
            if ( arr[j]==i)
            {
                found = true;
                break;
            }
        }
        if(!found){
                al.add(i);
         }
     }
    Collections.sort(al);
    return al.get(k-1);
    }
}