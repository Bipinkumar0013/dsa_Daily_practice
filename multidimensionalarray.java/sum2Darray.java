public class sum2Darray {
  public static void main(String[] args) {
    int [][] arr={{1,2,3},{1,2,3},{1,2,3}};
    int sum= 0 ;
    for (int i = 0;i<arr.length;i++){
      for (int j=0; j<arr[0].length ; j++){
        sum+=arr[i][j];
      }
    }
    System.out.print(sum+" ");
  }
  
}
