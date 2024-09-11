class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int ans = 0;

        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(hm.containsKey(n)){
                hm.put(n,hm.get(n)+1);
            }
            else{
                hm.put(n,1);
            }
        }

        for(int a : hm.keySet()){
            int n = hm.get(a);
            for(int i=n;i>1;i--){
                ans+=i-1;
            }
        }
        return ans;
    }
}