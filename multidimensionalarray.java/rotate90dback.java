public class rotate90dback {
  public static void main(String[] args) {
    int [][] arr={{1,2,3},{5,6,7},{7,8,9}};
    print(arr);
    for(int i=arr.length-1;i>=0;i--){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[j][i]+" ");
      }
        System.out.println();
    }
    // print(arr);

  }
  public static void print(int [][]arr){
    for(int [] a: arr){
      for(int ele : a){
        System.out.print(ele+" ");
      }
      System.out.println();
    }
  }
  
}
