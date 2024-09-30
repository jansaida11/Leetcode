class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count =0;
        int temp = 0;
        int l=0;
        for(int r=0;r<arr.length;r++) {
        	temp = temp+arr[r];
        	if(r-l==k) {
        		temp-=arr[l];
        		l++;
        	}
        	if(r-l+1==k) {
        		
        		if(temp/k>=threshold)
        			count++;
        	}
        }
        return count;
    }
}