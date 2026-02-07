package loop;
// 1,2,4,8,..
import java.util.Scanner;

public class Gp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digit you wanted");
    int n =sc.nextInt();
    int a=1,b=2;
    for(int i=1;i<=n;i++){
      System.out.print(a+" ");
      a*=b;
    }

  }
  
}
