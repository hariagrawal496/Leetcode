class Solution {
    public void duplicateZeros(int[] arr) 
    {
        List<Integer> list = new ArrayList<>() ;
        int j=0 ;

        for(int i=0; i<arr.length; i++)
        {
            if( arr[i] == 0)
            {
               list.add(0) ;       
            }
           list.add(arr[i]) ; 
        }

        int i=0 ;
        for(int x : list)
        {
            if( i == arr.length)
            {
                break ;
            }
            arr[i++] = x ;
        }
    }

}