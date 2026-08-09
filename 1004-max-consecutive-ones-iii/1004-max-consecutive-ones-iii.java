class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0;
        int left=0;
        int zerocount=0;
        int length=0;
        int maxlength=0;
        while(right<nums.length){
            if(nums[right]==0){
                zerocount++;
            }
            if(zerocount>k){
                
                if(nums[left]==0){
                    zerocount--;
                    
                }
                left++;
            }
        length=right-left+1;
        maxlength=Math.max(maxlength,length);
        right++;
    }return maxlength;
    }
}