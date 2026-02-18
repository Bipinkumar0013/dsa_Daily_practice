public class rotate {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    int n=arr.length;
    int r=9; //for r>n 3 rotaion equal to 9
    r=r%n;//9%6==3
    reverse(arr,0,r-1);
    reverse(arr,r,n-1);
    reverse(arr,0,n-1);
      
    for( int ele : arr){
      System.out.print(ele +" ");
    }
    
  }
  public static void reverse(int[] arr,int i,int j){
    while(i<j){
      int temp =arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
      
    // for( int ele : arr){
    //   System.out.print(ele);
    // }
  }
}
