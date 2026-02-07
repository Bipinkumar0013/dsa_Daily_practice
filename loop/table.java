package loop;

import java.util.Scanner;

public class table {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the number ");
    int n = sc.nextInt();
    // for (int i = n; i<=n*10;i=i+n){
    //   System.out.println(i);
    // }
    for (int i=1;i<=10;i++){
      System.out.println(i*n);
    }
    

    
    
  }

  
}
