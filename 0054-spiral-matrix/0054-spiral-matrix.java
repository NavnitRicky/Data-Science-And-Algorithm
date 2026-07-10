class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        int srow=0;
        int erow=matrix.length-1;
        int scol=0;
        int ecol=matrix[0].length-1;
//top
while(srow<=erow&&scol<=ecol){
    for(int i=scol;i<=ecol;i++){
        al.add(matrix[srow][i]);
    }
    

    //right
       for(int i=srow+1;i<=erow;i++){
        al.add(matrix[i][ecol]);
    }
    

    //button
    if(srow<erow){
    for(int i=ecol-1;i>=scol;i--){
        al.add(matrix[erow][i]);
    }
    }
    //left
  if(scol<ecol){
     for(int i=erow-1;i>srow;i--){
        al.add(matrix[i][scol]);
    }
  }
    srow++;ecol--; scol++;erow--;

}
return al;
        
    }
}