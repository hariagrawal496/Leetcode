class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        String ans = "" ;

        char[] arr1 = strs[0].toCharArray() ;

        for(int i=1; i<strs.length; i++)
        {
            char[] arr2 = strs[i].toCharArray() ;

            for(int j=0; j<arr1.length; j++)
            {
                if(j < arr2.length)
                {
                    if(arr1[j] != arr2[j])
                    {
                        arr1[j] = 0 ;
                    }
                }
                else
                {
                    arr1[j] = 0 ;
                }
            }
        }

        for(char c : arr1)
        {
            if(c == 0)
            {
               break ;
            }
             ans += c + "" ;
        }
        return ans ;
    }
}