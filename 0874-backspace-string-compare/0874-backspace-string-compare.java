class Solution {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<Character> stack = new Stack<>() ;

        /// string s 
         for(char c : s.toCharArray())
         {
             if(c == '#')
             {
                 if(!stack.isEmpty())
                 {
                     stack.pop() ; 
                 }
             }
             else
             {
                stack.push(c) ;
             }            
         }

         String str1 = "" ;

         while(!stack.isEmpty())
         {
            str1 += stack.pop() + "";
         }

         /// string t 
        for(char c : t.toCharArray())
        {
             if(c == '#')
             {
                 if(!stack.isEmpty())
                 {
                     stack.pop() ; 
                 }
             }
             else
             {
                stack.push(c) ;
             }            
        }

         String str2 = "" ;

         while(!stack.isEmpty())
         {
            str2 += stack.pop() + "";
         }

         if(str1.equals(str2))
         {
             return true ;
         }
        
        return false ;
    }
}