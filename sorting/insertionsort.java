package sorting;
public class insertionsort {
  public static void main(String[] args) {
    int [] arr={3,6,-1,8,9,0,2,};
    int n=arr.length;
    for(int i=1;i<n;i++){
      int j=i;
      while(j>0 && arr[j-1] >arr[j]){    
          int temp= arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
          j--;
      }
    }
    for (int ele : arr){
      System.out.print(ele +" ");
    }
    
  }
  
}
