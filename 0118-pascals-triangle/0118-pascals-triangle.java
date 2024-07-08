class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        int num = 0 ;
        List<List<Integer>> list = new ArrayList<>() ;

        while(num < numRows)
        {
            List<Integer> curr_Row = new ArrayList<>() ;
                  for(int i=0; i<=num ; i++)
                  {
                    if(i == 0 || i == num)
                    {
                        curr_Row.add(1);
                    }
                    else
                    {
                        List<Integer> prev_Row = list.get(num-1) ;
                        int value = prev_Row.get(i) + prev_Row.get(i-1) ;
                        curr_Row.add(value);
                    }
                  }
                  list.add(curr_Row);
                  num++ ;
        }
        return list ;
    }
}