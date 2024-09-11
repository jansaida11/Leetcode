class Solution {
    public boolean isIsomorphic(String s, String t) {
        LinkedHashMap <Character,Character> hm = new LinkedHashMap <> ();
        LinkedHashMap <Character,Character> rev = new LinkedHashMap <> ();
	       for(int i=0;i<s.length();i++){
                char sc = s.charAt(i);
                char tc = t.charAt(i);
	           if(!hm.containsKey(sc) && !rev.containsKey(tc)){
                    hm.put(sc,tc);
                    rev.put(tc,sc);
               }
               else{
                if((hm.containsKey(sc) && hm.get(sc)!=tc) || rev.containsKey(tc) && rev.get(tc)!=sc){
                    return false;

                }
               } 
              

	       }
	       
	       
	        return true;
    }
}