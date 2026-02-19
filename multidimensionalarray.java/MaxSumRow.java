public class MaxSumRow {
  public static void main(String[] args) {
     int [][] arr={{5,3,4},{1,2,3},{9,3,6}};
    int maxsum=0;
    int j=-1;
    for (int i = 0;i<arr.length;i++){
      int sum=0;
      for (int h=0; h<arr[0].length ; h++){
        sum+=arr[i][j];
        
      }
      maxsum=Math.max(maxsum,sum);
      j=i;
    }
    System.out.print(maxsum+" "+j);
    
  }
  

}
