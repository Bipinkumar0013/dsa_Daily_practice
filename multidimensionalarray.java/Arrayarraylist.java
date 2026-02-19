import java.util.ArrayList;
public class  Arrayarraylist {
  public static void main(String[] args){
    ArrayList<Integer> ans=new ArrayList<>();
    ans.add(10);
    ans.add(20);
    ans.add(30);
    ans.add(40);
     ArrayList<Integer> b=new ArrayList<>();
    b.add(20);
    b.add(40);
    b.add(30);
    b.add(70);
    Arraylist<ArrayList<Integer>> a= new ArrayList<>( );
    a.add(ans);a.add(b);
    System.out.print(a);

  }
  
}
