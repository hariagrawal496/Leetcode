class Solution {
    public List<List<Integer>> threeSum(int[] A) 
    {
        int n = A.length  ;
		Set<List<Integer>> set = new HashSet<>() ;
		
	    Arrays.sort(A) ;
		
		for(int i=0; i<n; i++)
		{
			int s = i+1 ;
			int e = n-1 ;
				
			while(s < e)
			{
				long sum = (long)(A[i] + A[s] + A[e])	 ;
					
					if(sum == 0)
					{
						List<Integer> data = new ArrayList<>() ;		 
							data.add(A[i]) ;
							data.add(A[s]) ;
							data.add(A[e]) ;						
						set.add(data) ;			
						
						s++ ;
						e-- ;
					}
				  	else if(sum > 0)
				    {
					   	e-- ;
				    }
					else
					{
						s++ ;
				 	}
			}
		}
		return new ArrayList<>(set) ;
        
    }
}