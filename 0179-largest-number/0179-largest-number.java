class Solution {
    public String largestNumber(int[] nums) 
    {
        int n = nums.length ;
        String[] arr = new String[n] ;
          
        for(int i=0; i<n; i++)
        {
            arr[i] = String.valueOf(nums[i]) ;
        }

        Comparator<String> comp = new Comparator<String>()
        {
            @Override
            public int compare(String s1 , String s2)
            {
                String str1 = s1 + s2 ;
                String str2 = s2 + s1 ;

                return str2.compareTo(str1) ;
            }
        } ;

        Arrays.sort(arr, comp) ;
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