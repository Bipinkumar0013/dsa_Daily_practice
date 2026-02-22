import java.util.Scanner;

public class stringbasic {
  public static void main(String[] args) {
    
//Scanner sc= new Scanner(System.in);
//  String o= sc.next();
// System.out.print(s);

// String t=sc.nextLine();

// // System.out.print(s);
//  System.out.print(t);
         
      // String s="bipin ";
      // s+="kumar";
      // System.out.print(s);
      // String s="bipinkumar";
      // System.out.print(s.substring(3,7));//ending index = e-1
  //     String s1="bipin";
  //     String s2="bipin";
  //  System.out.print(s1.equals(s2));
  StringBuilder s3=new StringBuilder("bipin");
  System.out.print(s3);
  s3.append("kuamr");
  System.out.print(s3);
  s3.reverse();
  System.out.println(s3);
  s3.setCharAt(3, 'o');
    
  }
  
}
