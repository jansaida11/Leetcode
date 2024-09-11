class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence : sentences){
           
           // max = Math.max(max,sentence.split(" ").length);
           if(max<sentence.split(" ").length){
                max = sentence.split(" ").length;
           }

        }
        // for(int i=0;i<sentences.length;i++){
        //     String s = sentences[i];
        //     int spcCount = 0;
        //     for(int j=0;j<s.length();j++){
        //         if(' ' == s.charAt(j)){
        //             spcCount++; // counting num of spaces in a sentence.
        //         }
        //     }
        //     max = Math.max(max,spcCount+1);
        // }
        return max;
    }
}