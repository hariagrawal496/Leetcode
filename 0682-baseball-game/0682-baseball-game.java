class Solution {
    public int calPoints(String[] operations) 
    {
        List<Integer> list = new LinkedList<>() ;
        int sum = 0 ;

        for(String str : operations )
        {
            if(str.equals("D"))
            {
                list.add(2 * list.get(list.size()-1)) ;
                sum += list.get(list.size()-1);
            }
            else if(str.equals("+"))
            {
              list.add( list.get(list.size()-1) +  list.get(list.size()-2)) ;
              sum += list.get(list.size()-1);
            }
            else if(str.equals("C")  && list.size() > 0)
            {
               sum -= list.get(list.size()-1) ;
                list.remove(list.size()-1) ;
            }
            else
            {
               list.add(Integer.parseInt(str)) ;
                sum += list.get(list.size()-1);
            }
        }
        return sum ;
    }
}