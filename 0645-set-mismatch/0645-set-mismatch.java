class Solution {
    public int[] findErrorNums(int[] nums) {

        int n= nums.length;

        int [] res = new int[2];
		
		Set<Integer> s = new TreeSet<>();
		int missing = 0;
        int duplicate  = 0;
		for(int i=0;i<nums.length;i++) 
        {
			if(!s.add(nums[i])) 
            {
				duplicate = nums[i];
			}
		}
		int expectedSum = n*(n+1)/2;
        int actualSum = 0;
		for(int i=0;i<nums.length;i++) 
        {
            actualSum += nums[i];
		}
		
        missing = expectedSum - (actualSum-duplicate);
        res[0] = duplicate;
        res[1] = missing;
		return res;

    }
}