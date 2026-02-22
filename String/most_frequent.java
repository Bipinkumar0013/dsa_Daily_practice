public class most_frequent {
  public static void main(String[] args) {
    String s="gjhjvieurhvevbbveiv";
     int i=0;
        int j=0;
        int Max_count=1;
        int max=1;
        do{
            if(s.charAt(i)==s.charAt(j)) j++;
            else {max =j-i;
             i=j;
             if(max>Max_count) Max_count=max;
            }
        }while(j<s.length());
        max =j-i;
             if(max>Max_count) Max_count=max;

        System.out.print(Max_count);
        
  }
  
}
