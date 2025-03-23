class Solution {
    public int numberOfWeakCharacters(int[][] properties) 
    { 
        Arrays.sort(properties, (a,b) -> (a[0] == b[0]) ? a[1] - b[1] : b[0] - a[0])  ;

        int n = properties.length;
        int max = 0;
        int count = 0;

        for(int[] x : properties)
        {
            System.out.println(x[0] + " -> " + x[1]) ;
        }

         System.out.println("-------");

        for(int i=0; i<n; i++)
        {
            if(properties[i][1] < max) 
            {
                count++;
            }

            max = Math.max(max, properties[i][1]);
        }

      return count ;  
    }
}