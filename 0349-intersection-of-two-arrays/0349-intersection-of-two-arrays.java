class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
       Set<Integer> set = new HashSet<>() ;
       for(int x : nums1)
       {
         set.add(x) ;
       }

       int count = 0 ;
       for(int i=0; i<nums2.length; i++)
       {
         if(set.contains(nums2[i]))
         {
             count++ ;
            set.remove(nums2[i]);
         }
         else
         {
            nums2[i] = -1 ;
         }
       }

       int[] arr = new int[count] ;
       int k = 0 ;

        for(int i=0; i<nums2.length; i++)
        {
           if(nums2[i] != -1)
           {
            arr[k++] = nums2[i] ;
           }
        }
        return arr ;
    }
}