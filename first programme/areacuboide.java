import java.util.Scanner;

public class areacuboide {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l,b,h;
    System.err.print("enter length ");
    l=sc.nextInt();
    System.err.print("enter bredth ");
    b=sc.nextInt();
    System.err.print("enter height ");
    h=sc.nextInt();
     int a =2*(l*b+b*h+h*l);
     System.err.println("area is");
     System.out.println(a);
     sc.close();
  }
}