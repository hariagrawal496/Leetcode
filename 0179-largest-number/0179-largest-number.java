class Solution {
    public String largestNumber(int[] nums) 
    {
        int n = nums.length ;
        List<String> list = new ArrayList<>() ;
          
        for(int i=0; i<n; i++)
        {
            String val = String.valueOf(nums[i]) ;
            list.add(val) ;
        }

       list = list.stream().sorted((a,b) -> (b+a).compareTo(a+b)).toList() ;
         
        if(list.get(0).charAt(0) == '0')
        {
            return "0" ;
        }

        String ans = "" ;
        for(String s : list)
        {
            ans += s + "" ;
        }
   
    return ans ;
    }
}