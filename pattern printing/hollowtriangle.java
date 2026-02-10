import java.util.Scanner;
public class hollowtriangle {
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=2*n-1;j++){
        int a=i;
        int b=j;
        
        if(j>n) b=2*n-j ;
        if(a+b==n+1 ) System.out.print("*"+" ");
        else System.out.print("  ");

      }
      System.out.println();
    
    }
     for(int i=1;i<=2*n-1;i++){
      System.out.print("*"+" ");
      }
  }
}