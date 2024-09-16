class Solution {
    public int countGoodSubstrings(String s) {
		int count=0;
		int sl = 3;
		
		int l =0;
		
		StringBuilder temp = new StringBuilder();
		
		for(int r=0;r<s.length();r++) {
			
			temp.append(s.charAt(r));
			
			if(r-l==sl) {
				temp=temp.delete(0,1);
				
				l++;
			}
			if(r-l+1==sl) {
				
				if(isGood(temp.toString())){
                    count++;
                }
			}
		}
		  return count;	
    
    }
   
    public static boolean isGood(String s) {

        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hs.add(s.charAt(i))) {
                return false;
            }
        }
        return true;
}
}