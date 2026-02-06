import java.util.Scanner;

public class threenumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number");
    int a = sc.nextInt();
     System.out.println("enter second number");
    int b = sc.nextInt();
     System.out.println("enter third number");
    int c= sc.nextInt();
   // if(a>b){
  //  /if(a>c) System.out.print("a is larger");
  //     else System.out.println("c is greater");
  //  }
  //else{
  //if(b>c) System.out.print("b is larger");
  //     else System.out.println("c is greater");}
//Using terniary operator
System.out.println((a>b)? (a>c) ? a :c :(b>c)?b:c);
   }
  } 
  

