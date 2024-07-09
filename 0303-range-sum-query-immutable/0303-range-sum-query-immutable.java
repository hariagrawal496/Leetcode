class NumArray 
{
    int[] prefixSum  ;

    public NumArray(int[] nums) 
    {
        prefixSum = new int[nums.length] ;
        for(int i=0; i<nums.length; i++)
        {
            prefixSum[i]  = (i== 0) ? nums[i] : (prefixSum[i-1]+nums[i]) ;
        }
    }
    
    public int sumRange(int left, int right) 
    {
        int leftSum = (left == 0) ? 0 : prefixSum[left-1] ;
        int rightSum = prefixSum[right] ;

        return rightSum-leftSum ;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */