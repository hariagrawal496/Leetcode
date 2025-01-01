class Solution {
    public void sortColors(int[] nums) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ;

        for(int x : nums)
        {
            minHeap.add(x) ;
        }

        for(int i=0; i<nums.length; i++)
        {
            nums[i] = minHeap.remove() ;
        }
        
    }
}