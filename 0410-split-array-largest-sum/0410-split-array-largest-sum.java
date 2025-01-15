class Solution {

    private boolean canSplitArray(int[] nums, int k,int mid){
        int subArraysCount = 1;
        int currentSum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]+currentSum<=mid){
                currentSum+=nums[i];
            }else{
                currentSum = nums[i];
                subArraysCount++;

                if(subArraysCount>k){
                    return false;
                }
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int ele:nums){
            low = Math.max(ele,low);
            high+=ele;
        }

        while(low<=high){
            int mid = low+(high-low)/2;

            if(canSplitArray(nums,k,mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}