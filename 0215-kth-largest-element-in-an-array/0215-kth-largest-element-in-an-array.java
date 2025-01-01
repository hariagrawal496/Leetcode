class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b-a) ; // By default it is mean heap

        for(int i=0; i<nums.length; i++)
        {
            maxHeap.add(nums[i]) ;
        }

        for(int i=0; i<k-1; i++)
        {
            maxHeap.remove() ;
        }
     
     return maxHeap.peek() ;
    }
}