import java.util.Scanner;

public class pyramid {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the n: ");
    int n=sc.nextInt();
  //   for(int i=1;i<=n;i++){
  //     for(int j=1;j<=n-i;j++){
  //       System.out.print("  ");
  //     } 
  //     for(int j=1;j<=2*i-1;j++){
  //       System.out.print("*"+" ");

  //   }
  //   System.out.println();

    
  // }
  int nst =1;
  int nsp=n-1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=nsp;j++){
        System.out.print("  ");
      } 
      for(int j=1;j<=nst;j++){
        System.out.print("*"+" ");

    }
    nsp-=1;
    nst+=2;
    System.out.println();
  
}
}
}
