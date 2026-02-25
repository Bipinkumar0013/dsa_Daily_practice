public class selectionlastmax {
  public static void main(String[] args) {
     int [] arr={2,7,-1,-3,6,4,9,3};
    int n=arr.length;
    for(int i=n-1;i>=0;i--){
      int max=arr[0];
      int maxidx=-1;
      for(int j=i;j>=0;j--){
        if(arr[j]>max){
          max=arr[j];
          maxidx=j;
        }
      }
      int temp = arr[i];
      arr[i]=arr[maxidx];
      arr[maxidx] = temp;
    }
    for(int ele : arr){
      System.out.print(ele);
    }
  }
  
}
