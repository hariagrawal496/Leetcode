class Solution {
    public int[] searchRange(int[] arr, int key) 
    {
    	int[] data = new int[2] ;	
		data[0] = firstOccurance(arr, key) ;
		data[1] = LastOccurance(arr, key) ;
		
		return data ;
	}
	
	public int firstOccurance(int[] arr, int key)
	{
		int s = 0 ;
		int e = arr.length-1 ;
		
		int first = -1 ;
		
		while(s <= e && e < arr.length)
		{
			int mid = s + (e-s)/2 ;
			
			if(arr[mid] == key)
			{
				first = mid ;
				 e = mid-1 ;
			}	
			else if(arr[mid] < key)
			{
				s = mid + 1 ;
			}
			else
			{
				e = mid - 1 ;
			}
			
		}
		return first ;
	}
	
	public int LastOccurance(int[] arr, int key)
	{
		int s = 0 ;
		int e = arr.length-1 ;
		
		int last = -1 ;
		
		while(s <= e && e < arr.length)
		{
			int mid = s + (e-s)/2 ;
			
			if(arr[mid] == key)
			{
				last = mid ;
				 s = mid + 1 ;
			}	
			else if(arr[mid] > key)
			{
				e = mid - 1 ;
			}
			else
			{
				s = mid + 1 ;
			}
			
		}
		return last ;
	}
}