class Solution {
    public String largestNumber(int[] nums) 
    {
        int n = nums.length ;
        String[] arr = new String[n] ;

        for(int i=0; i<n; i++)
        {
            arr[i] = String.valueOf(nums[i]) ;
        }

        PriorityQueue<String> minHeap = new PriorityQueue<>((a,b) -> (b+a).compareTo(a+b)) ;
        String ans = "" ;

        for(String x : arr)
        {
            minHeap.add(x) ;
        }

          ans += minHeap.remove() + "" ; // checking  first element
          if(ans.equals("0"))
          {
            return ans ; // 0 only
          }

        while(!minHeap.isEmpty())
        {
            ans += minHeap.remove() + "" ;
        }
 
        return ans ;
    }
}