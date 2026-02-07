package loop;
import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n= sc.nextInt();
    boolean flag =true ;
    for(int i=2;i<=n-1;i++){
      if(n%i==0) flag =false;
      break;
    }
    if(flag==true)System.out.println("prime number");
    else System.out.println("compsite number");
  }
  
 // for(i=2; i<=Math.sqrt(n);i++) help to manage time complexiity
}
