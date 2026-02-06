import java.util.Scanner;

public class absolut {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number");
    int n = sc.nextInt();
    if (n<0) n = -n;
    System.out.print(n);


  }
  
}
