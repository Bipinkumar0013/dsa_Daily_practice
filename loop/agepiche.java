package loop;

import java.util.Scanner;

public class agepiche {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digit you wanted ");
    int n= sc.nextInt();
    int a=n,b=1;
    for(int i=1;i<=n;i++){
      System.out.println(i);
      System.out.println(a);
      a-=b;

    }
    

  }
  
  
  
}
