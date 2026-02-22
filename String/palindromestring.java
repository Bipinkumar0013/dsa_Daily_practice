import java.util.Scanner;

public class palindromestring {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the word: ");
    String s=sc.nextLine();
    int n=s.length();
    int i=0;
    int j=n-1;
    boolean flag=true;
    while(i<=j){
      if(s.charAt(i)!=s.charAt(j)){ 
        flag=false; 
    }
      i++;
      j--;
    }
   if(flag==true) System.out.print("It is palindrome");
   else System.out.print("Not a palindrome");
   
    
  }
  
}
