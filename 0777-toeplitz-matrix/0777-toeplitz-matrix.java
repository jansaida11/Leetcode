class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean ans = true;
        for(int i=0;i<c;i++){
            boolean t = valid(matrix,0,i);
            if(!t){
                ans = false;
            }
        }
        for(int j=1;j<r;j++){
            boolean t = valid(matrix,j,0);
            if(!t){
                ans = false;
            }
        }
        return ans;
    }

    public boolean valid(int [][] mat,int y,int x){
        int r = mat.length;
        int c = mat[0].length;
        int temp = mat[y][x];
        boolean check = true;
        while(y<r && x<c){
            if(mat[y][x]!=temp){
                check = false;
                break;
            }
            y++;
            x++;
        }
        return check;
    }
}