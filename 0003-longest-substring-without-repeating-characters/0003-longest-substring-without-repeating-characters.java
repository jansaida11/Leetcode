class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0;
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        for(int r=0;r<n;r++){
            char c = s.charAt(r);
            if(!hs.contains(c)){
                hs.add(c);
            }else{
                while(hs.contains(c)){
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(c);
            }
            ans = Math.max(ans,(r-l+1));
        }
        return ans;
    }
}