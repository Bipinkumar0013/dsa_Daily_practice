import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylistbasics {
  public static void main(String[] args) {
    ArrayList<Integer> arr= new ArrayList<>();
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    arr.set(3,50);
  //  int n=arr.size();
   arr.add(2,100);
  //  arr.remove(n-1);
   int n=arr.size();
   int i=0; int j=n-1;
   while(i<j){
    int temp=arr.get(i);
    arr.set(i,arr.get(j));
    arr.set(j,temp);
    i++;
    j--;//we can also use Collection.reverse
   }
   Collections.reverse(arr);
      System.out.print(arr);

    

  }
  
}
