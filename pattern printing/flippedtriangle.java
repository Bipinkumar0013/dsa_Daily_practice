import java.util.Scanner;

public class flippedtriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the n: ");
    int n=sc.nextInt();
     for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i;j++){
       System.out.print("  ");//j<=(n+1)-1
       }
      for(int j=1;j<=i;j++){
         System.out.print((char)(i+64)+" ");
       }
       System.out.println();


   }
   }
  
  
  
  
}
