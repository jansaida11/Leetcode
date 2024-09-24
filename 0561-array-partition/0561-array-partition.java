class Solution {
    public int arrayPairSum(int[] nums) {
     
        int maxSum = 0;
        Arrays.sort(nums);
        
        for(int r=0;r<nums.length;r+=2){
            
                maxSum += nums[r];
            
       }
       return maxSum;
    }
}