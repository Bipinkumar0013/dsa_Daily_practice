import java.util.Scanner;

public class cordinategeometry {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter x-axis");
    int x = sc.nextInt();
     System.out.println("Enter y-axis");
    int y= sc.nextInt();
    if(x>0 && y>0)System.out.println("it is first quadrant");
    else if(x>0 && y<0)System.out.println("it is fourth quadrant ");
    else if(x<0 && y>0)System.out.println("it is second quadrnt");
    else if(x<0 && y<0)System.out.println("it is third quadrant");
   else  if(x==0 && y!=0)System.out.println("it is y-axis");
   else if(x!=0 && y==0)System.out.println("it is x-axis");
    else System.out.println("it is origin");


  }
  
}
