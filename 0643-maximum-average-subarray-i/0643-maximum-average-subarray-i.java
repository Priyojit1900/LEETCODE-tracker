class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<k;i ++){
            sum=sum+nums[i];
        }
        int max_sum=sum;
        double max_avg = (double) max_sum / k;
        int right=k;
        int left=0;
        while(right<nums.length){
            sum=sum-nums[left]+nums[right];
            max_sum=Math.max(max_sum,sum);
            max_avg=(double)max_sum/k;
            right++;
            left++;

        }
        return max_avg;
    }
}