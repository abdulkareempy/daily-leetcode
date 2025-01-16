class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int largest = 0;
        int current = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                current++;
                largest = Math.max(current,largest);
            }
            else{
                current = 0;
            }
        }
        return largest;
        
    }
}