class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length-1;i++){
            String rev = reverse(words[i]);
            for(int j=i+1;j<words.length;j++){
                if(words[j].equals("0")){
                    continue;
                }
                if(rev.equals(words[j]))
                {
                    count++;
                    words[j] = "0";
                    break;
                }
            }
        }
        return count;
    }
    public String reverse(String s){
        String a = "";
        for(int i =s.length()-1;i>=0;i--){
            a = a + s.charAt(i); 
        }
        return a;
    }
}