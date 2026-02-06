import java.util.Scanner;

public class trianglesides {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("enter first sides");
    int a = sc.nextInt();
     System.out.println("enter second sides");
    int b = sc.nextInt();
     System.out.println("enter third sides");
    int c= sc.nextInt();
    if(a+b>c && b+c>a && c+a>b)System.out.println("it is sides of triangle");
    else System.out.println("it is not   a triangle");
  }
  
}
