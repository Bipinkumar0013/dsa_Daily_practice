import java.util.List;
import java.util.ArrayList;
public class Pascaltriangle {
  public static void main(String[] args) {
    List<List<Integer>> arr=new ArrayList<>();
    for(int i=0;i<=arr.size();i++){
      List<Integer> a=new ArrayList<>();
      for(int j=0;j<=i;j++){
        a.add(1);

      }
      arr.add(a);

    }
    for(int i=0;i<=arr.size();i++){
      for(int j=0;j<=i;j++){
        if(j==0 || j==i) arr.get(i).add(1);
        else{ 
          int var = arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
          arr.get(i).set(j,var);
        }
      }
    }
    for(List<Integer> ans : arr){
      for (int ele : ans){
        System.out.print(ele);
      }
      System.out.println();
    }

  }
  
}
