package sorting;

public class bubblesort {
  public static void main(String[] args) {
    int [] arr={4,3,5,6,1,6};
      Bubblesort(arr);
      print(arr);
    
  }
  public static int Bubblesort(int[] arr){
    int n= arr.length;
    for (int i=0;i<n-1;i++){//pass
       boolean flag=true;//check
       for(int j=0;j<n-1-i;j++){//travel
        if(arr[j]>arr[j+1]){
          flag=false;//not sorted
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
