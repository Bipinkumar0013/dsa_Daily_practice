

import java.util.Arrays;

public class sorttwosum {
  public static void main(String[] args) {
    int [] arr={6,3,7,2,-9,5};
    int target=10;
    Arrays.sort(arr);
    int n=arr.length;
    int i=0,j=n-1;
    while(i<j){
      if(arr[i]+arr[j]==target){
        System.out.print(arr[i]);
      System.out.print(arr[j]);
      }
      else if(arr[i]+arr[j]<target) i++;
      else  j--;
      
    }
    
  }
  
}
