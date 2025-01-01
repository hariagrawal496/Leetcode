class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>() ; // By default it is mean heap

        for(int i=0; i<nums.length; i++)
        {
            minHeap.add(nums[i]) ;
        }

        for(int i=0; i<nums.length-k; i++)
        {
            minHeap.remove() ;
        }
     
     return minHeap.remove() ;
    }
}