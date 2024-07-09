class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> list = new ArrayList<>() ;
        if(nums.length == 0)
        {
            return list ;
        }

        int lower = nums[0] ;
        int upper = nums[0] ;

        for(int i=1;i<nums.length;i++)
        {
            upper++ ;
            if(nums[i] == upper)
            {
                continue ;
            }
            else
            {
                if(nums[i-1] == lower)
                {
                    list.add(lower + "") ;
                }
                else
                {
                    list.add(lower + "" + "->" + nums[i-1] + "");
                }  
            }      
        lower = nums[i] ;
        upper = nums[i] ;
        }
        
            if(lower == upper)
            {
               list.add(lower + "") ;
            }
            else
            {
               list.add(lower + "" + "->" + upper + "");
            }

     return list ;
    }
}