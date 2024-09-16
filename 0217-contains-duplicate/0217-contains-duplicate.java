class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.add(num)==false){
                return true;
            }
            
        }
        return false;
    }
}