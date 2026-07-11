class Solution {
    public int[][] generateMatrix(int n) {
      int matrix[][]=new int[n][n];        
        int srow=0;
        int erow=matrix.length-1;
        int scol=0;
        int ecol=matrix[0].length-1;
//top
int a=1;
while(srow<=erow&&scol<=ecol){
    for(int i=scol;i<=ecol;i++){
        matrix[srow][i]=a++;
    }
    

    //right
       for(int i=srow+1;i<=erow;i++){
        matrix[i][ecol]=a++;
    }
    

    //button
    if(srow<erow){
    for(int i=ecol-1;i>=scol;i--){
        matrix[erow][i]=a++;
    }
    }
    //left
  if(scol<ecol){
     for(int i=erow-1;i>srow;i--){
        matrix[i][scol]=a++;
    }
  }
    srow++;ecol--; scol++;erow--;

}
return matrix;
        
    }

}