class Solution {
    public int maxDistance(int[] colors) {
        
        int start = 0;
    	int end = colors.length-1;
    	int max1 = 0;
    	int max2 = 0;
    	
    	for(int i=0;i<colors.length;i++) {
    		if(colors[i]!=colors[end]) {
    			max1 = Math.max(max1, end-i);
                break;
    		}
    	}
    	
    	for(int i=colors.length-1;i>=0;i--) {
    		if(colors[i] != colors[start]) {
    			max2 = Math.max(max2, i-start);
                break;
    		}
    	}
    	
    	return Math.max(max1, max2);
       
    }
}