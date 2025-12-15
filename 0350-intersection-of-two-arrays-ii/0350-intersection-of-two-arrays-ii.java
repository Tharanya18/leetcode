import java.util.HashMap;
import java.util.Vector;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer>map= new HashMap<>();
       Vector<Integer> result = new Vector<>();
       for(int i =0 ; i< nums1.length ; i++)
       {
         if(map.containsKey(nums1[i]))
         {
            map.put(nums1[i],map.get(nums1[i])+1);
         }
         else
            map.put(nums1[i],1);
       }
       for(int num : nums2)
       {
        if(map.containsKey(num) && map.get(num)>0)
        {
            result.add(num);
            map.put(num,map.get(num)-1);
        }
       }
       int[] ans = new int[result.size()];
    for( int i =0;i< result.size();i++)
         ans[i]=result.get(i);
    

    return ans;

    }
}