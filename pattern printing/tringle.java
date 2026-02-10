import java.util.Scanner;

public class tringle {
  public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
    System.out.print("Enter the row :");
    int r =sc.nextInt();
    // System.out.print("Enter the coloumn :");
    // int c =sc.nextInt();

    // for(int i=1 ;i<=r ;i++){
    //   for(int j=1 ;j<=i ;j++){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
      
    // }
      
      for(int i=1 ;i<=r ;i++){
      for(int j=1 ;j<=i ;j++){
        System.out.print(i+" ");
      }
      System.out.println();
      
    }
    
  }
  
}
