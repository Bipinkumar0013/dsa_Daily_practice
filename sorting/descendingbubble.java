package sorting;

public class descendingbubble {
   public static void main(String[] args) {
    int [] arr={4,3,5,6,1,6};
      Bubblesort(arr);
      print(arr);
    
  }
  public static int Bubblesort(int[] arr){
    int n= arr.length;
    for (int i=0;i<n-1;i++){
       boolean flag=true;
       for(int j=0;j<n-1-i;j++){
        if(arr[j]<arr[j+1]){//decending order
          flag=false;
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1] =temp;
        }
       }
       if(flag==true) break;
    }
    return 0;

  }
  public static void print(int[] arr){
    for ( int ele : arr){
      System.out.print(ele+" ");
    }
  
}
}
