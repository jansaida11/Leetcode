class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hm = new HashMap();
       int ans =0;

        for(int i=0;i<stones.length();i++){
            hm.put(stones.charAt(i),hm.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char c = jewels.charAt(i);
            if(hm.containsKey(c)){
                ans+=hm.get(c);
            }
        }
        return ans;
    }
}