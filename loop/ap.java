package loop;

import java.util.Scanner;

public class ap { // 2,5,8..
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digit you wanted");
    int n =sc.nextInt();
   
    // for(int i=2;i<=3*n-1;i+=3){
    //   System.out.print(i+" ");
    // }
    int a=2, b=3;
    for(int i=1;i<=n;i++){
      System.out.println(a);
      a+=b;
    }
    
  }
  
}
