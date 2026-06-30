class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] merge = new int[nums1.length +nums2.length];
        int i = 0 , j = 0 , k = 0 ;
        while( i < nums1.length && j <nums2.length){
            if(nums1[i] < nums2[j])
               merge[k++] = nums1[i++];
            else
               merge[k++] = nums2[j++];
        }
        while( i < nums1.length)
         merge[k++]= nums1[i++];
        while( j < nums2.length)
         merge[k++] = nums2[j++];
        int n = merge.length;
        double ans;
        if( n % 2 == 1){
            ans = merge[n/2];
        }
        else
          ans = (merge[n/2]+merge[(n/2)-1])/2.0 ;

        return ans;
    }
}