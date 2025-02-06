class Solution {
    public String intToRoman(int num) 
    {
        
		int[] arr =  {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000} ;
	    String[] str =  {"I","IV","V","IX","X","XL","L","XC",
						    "C","CD","D","CM","M"} ;
		
		String ans = "" ;
		
		while(num  > 0)
		{
			for(int i=arr.length-1; i>=0; i--)
			{
				if(num >= arr[i])
				{
					ans += str[i] ;
					num = num - arr[i] ;
					break ;
				}
			}
		}
		return ans ;
    }
}