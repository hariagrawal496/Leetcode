class Solution {
    public String largestNumber(int[] nums) 
    {
        int n = nums.length ;
        String[] arr = new String[n] ;
          
        for(int i=0; i<n; i++)
        {
            arr[i] = String.valueOf(nums[i]) ;
        }

        Arrays.sort(arr, (a,b)-> (b+a).compareTo(a+b)) ;

        if(arr[0].charAt(0) == '0')
        {
            return "0" ;
        }

        String ans = "" ;
        for(String s : arr)
        {
            ans += s + "" ;
        }
   
    return ans ;
    }
}