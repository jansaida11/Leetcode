class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }

        int newNum = x;
        int length = 0;
       while(x!=0){
           int rem = x%10;
           x = x/10;
           length++;
       }
       int [] ar = new int[length];
       
       for(int i=0;i<length;i++){
           ar[i] = newNum%10;
           newNum = newNum/10;
       }
       boolean isPal = true;
     for(int j=0;j<length/2;j++){
         if(ar[j]!=ar[length-j-1]){
             isPal = false;
             break;
         }
     }
     if(isPal){
         return true;
     }
     else{
         return false;
     }
    }
}