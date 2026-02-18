// package array;

import java.util.Scanner;

public class max {
  public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
    System.out.print("Enter the size of array: ");

     int n=sc.nextInt();
    
    int[] arr =new int[n];//int[] arr={1,2,3,4,5};
    System.out.print("Enter the element of array: ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max = arr[0];
    for(int i =0;i<n;i++){
      if(arr[i]>max) max=arr[i];
    }
    System.out.print(max);
  }
  
}
