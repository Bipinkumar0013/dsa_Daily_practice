public class Sum_substring {
  public static void main(String[] args) {
    String s="Bipin";
    int sum=0;
    for(int i=0;i<=s.length();i++){
      for(int j=i+1 ; j<=s.length();j++){
       String ch= s.substring(i,j);
       for(int k=0;k<ch.length();k++){
        sum+=ch.charAt(k);
       }
      }
    }
    System.out.print(sum);
  }
}
  
  

