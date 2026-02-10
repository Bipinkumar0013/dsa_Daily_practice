import java.util.Scanner;

public class ultatriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number: ");
    int n= sc.nextInt();
    // for (int i = 1 ; i<=n;i++){
    //   for (int j=1;j<=n+1-i;j++){
    //     System.out.print( (char)(j+64)+" ");
    //   }
    //   System.out.println();
    // }
    //Using of third variable
    //we can do many thing by intialising of third and fourth variable
    
    // int a=65;two different meaning using it inside and outside of loop
    int a=n;
  for (int i = 1 ; i<=n;i++){
    
      for (int j=1;j<=a;j++){
        System.out.print( '*' +" ");
        
      }
      a--;
      System.out.println();
    }
  }
  
}
