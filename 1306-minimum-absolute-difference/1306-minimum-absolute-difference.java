class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        Arrays.sort(arr) ;
        int n = arr.length ;
        List<List<Integer>> list = new ArrayList<>() ;

        int diff  = Integer.MAX_VALUE ;
        for(int i=0; i<n-1; i++)
        {
           diff = Math.min( diff , (arr[i+1] - arr[i]) ) ;
        }
       
        for(int i=0; i<n-1; i++)
        {
                List<Integer> data = new ArrayList<>() ;
                    if( (arr[i+1] - arr[i]) == diff)
                    {
                        data.add(arr[i]) ;
                        data.add(arr[i+1]) ;
                        list.add(data) ;
                    }     
        }
        return list ;
    }
}