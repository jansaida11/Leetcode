class Solution {
    public String decodeMessage(String key, String message) {
        LinkedHashMap <Character,Character> hm = new LinkedHashMap<>();
        char ch = 'a';
        for(int i=0;i<key.length();i++){
            char c = key.charAt(i);
            if(c != ' '){
               if(!hm.containsKey(c)){
                   hm.put(c,ch);
                   ch++;
               }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length();i++){
            char c = message.charAt(i);
            if(c != ' '){
                sb.append(hm.get(c));
            }
            else{
               sb.append(c);
            }
            
        }

        return sb.toString();


    }
}