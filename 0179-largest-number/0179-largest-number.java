class Solution {
    public String largestNumber(int[] nums) 
    {
        int n = nums.length ;
        String [] arr = new String[n] ;

        for(int i=0; i<nums.length; i++)
        {
            arr[i] = String.valueOf(nums[i]) ;
        }

        PriorityQueue<String> q = new PriorityQueue<>((a,b) -> (b+a).compareTo(a+b)) ; // decresing order

        for(String s : arr)
        {
            q.add(s) ;
        }

          if(q.peek().charAt(0) == '0')
          {
            return "0" ;
          }

          String ans = "" ;

          while(!q.isEmpty())
          {
             ans += q.remove() ;
          }
     
      return ans ;
    }
}