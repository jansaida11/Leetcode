class Solution {
    public int minimumDifference(int[] nums, int k) {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l=0;
        for(int r=k-1;r<nums.length;r++) {
        	
        	int temp = nums[r] - nums[l];
        	diff = Math.min(diff, temp);
        	l++;
        }
        
        
        
        return diff;
       
    }
}