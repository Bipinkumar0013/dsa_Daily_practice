package loop;

import java.util.Scanner;

public class power {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the base: ");
    int a = sc.nextInt();
      System.out.print("Enter the power :");
    int b = sc.nextInt();
    int pow=1;
    for (int i = 1 ; i<=b;i++){
      pow*=a;

    }
    System.out.println(a+" "+ "raise to power"+" "+ b+" " +"is"+" " + pow);
  
}
}
