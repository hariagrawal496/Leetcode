class Solution {
    public List<List<Integer>> fourSum(int[] A, int target) 
    {
        int n = A.length ;
        Arrays.sort(A) ;
		
		Set<List<Integer>> set = new HashSet<>() ;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				int s = j+1 ;
				int e = n-1 ;
				
				while( s < e)
				{
				   long sum = (long)((long)A[i]+ (long)A[j] + (long)A[s] +(long) A[e]) ;
						if(sum == target)
						{
							List<Integer> data = new LinkedList<>() ;
							 data.add(A[i]) ;
							 data.add(A[j]) ;
							 data.add(A[s]) ;
							 data.add(A[e]) ;

							set.add(data) ;

							s++ ;
							e-- ;
						}
						else if(sum > target)
						{
							e-- ;
						}
						else
						{
							s++ ;
						}
				}
			}
		}
		return new ArrayList<>(set) ;
    }
}