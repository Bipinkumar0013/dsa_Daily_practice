import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String s="nagaram";
   String t="angara";
   Boolean flag=true;
   if(s.length()!=t.length())  flag=false;
   char []s1=s.toCharArray();
   char []s2=t.toCharArray();
    Arrays.sort(s1);
   Arrays.sort(s2);
   int i=0;
   while(i!=s.length()){
    if(s1[i]!=s2[i]) flag=false;
    i++;
   }
   if(flag==true) System.out.print("It is Anagram");
   else System.out.print("Not a anagram");

  }
  
}
