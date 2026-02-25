public class selectionsort {
  public static void main(String[] args) {
    int [] arr={2,7,-1,-3,6,4,9,3};
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      int min=arr[0];
      int minidx=-1;
      for(int j=i;j<n;j++){
        if(arr[j]<min){
          min=arr[j];
          minidx=j;
        }
      }
      int temp = arr[i];
      arr[i]=arr[minidx];
      arr[minidx] = temp;
    }
    for(int ele : arr){
      System.out.print(ele);
    }
  }
  
}
