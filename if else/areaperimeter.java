import java.util.Scanner;

public class areaperimeter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the length ");
    int l = sc.nextInt();
     System.out.print("enter the width ");
    int w = sc.nextInt();
     int a= l*w;
     int p=2*(l+w);
     System.out.println(a);
     System.out.println(p);
     if (a>p) System.out.println("area is greater then perimeter");



  }
}
