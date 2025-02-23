class Solution {
    public int passThePillow(int n, int time) 
    {
        int completeCycle = time / (n-1) ;
        int lastCycle = time % (n-1) ;

         if(completeCycle % 2 == 0)  // if true it mean its come to starting point
         {
            return lastCycle + 1 ;
         }

        return n - lastCycle ; // // if false it mean its is at last point
    }
}