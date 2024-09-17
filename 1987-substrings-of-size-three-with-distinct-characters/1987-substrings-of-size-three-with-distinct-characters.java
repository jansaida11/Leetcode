class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        HashMap <Character,Integer> hm = new HashMap<>();
        int l =0;
        int sl = 3;
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(r-l == 3){
                char ch = s.charAt(l);
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    hm.remove(ch);
                }
                l++;
            }

            if(hm.size()==3){
                ans++;
            }
        }
    return ans;
    }
}