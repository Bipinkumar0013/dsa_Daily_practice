import java.util.Scanner;

public class bridge {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the n: ");
    int n= sc.nextInt();
    for(int i=1;i<=2*n+1;i++){
      System.out.print("*"+" ");

    }
    System.out.println();
      int nst =n;
      int nsp=1;
    for(int i=1;i<=n;i++){
      
      for(int j=1;j<=nst;j++){
        System.out.print("*"+" ");
      } 
      for(int j=1;j<=nsp;j++){
        System.out.print("  ");

    }
    for(int j=1;j<=nst;j++){
        System.out.print("*"+" ");
      } 
   nst-=1;
   nsp+=2;
    System.out.println();
  
}

    
  }
  
  
  
}
