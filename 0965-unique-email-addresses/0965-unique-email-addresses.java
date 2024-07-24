class Solution {
    public int numUniqueEmails(String[] emails) 
    {
        Set<String> set = new HashSet<>() ;

        for(String email : emails)
        {
             String[] str = email.split("@") ;
             String ans = "" ;

             for(char x : str[0].toCharArray())
             {
                 if(x == '.')
                 {
                    continue ;
                 }
                 else if(x == '+')
                 {
                    break ;
                 }
                 else
                 {
                    ans += x + "" ;
                 }
             }

             ans += '@' + "" + str[1] ;
             set.add(ans) ;
        }
        return set.size() ;
    }
}