import java.util.List;
import java.util.ArrayList;
public class SpiralMatrix {
  public static void main(String[] args) {
    
  }
  public static List<List<Integer>> spiral(int [][] arr){
    List<List<Integer>> ans= new ArrayList<>();
    int n= arr.length;
    int m= arr[0].length;
    int fr=0,lr=n-1;
    int fc=0,lc=m-1;
    while(fr>lr && fc>lc){
      for(int i=fc;i<=lc;i++){
        System.out.print(arr[fr][i]);
        fr++;
        if(fc>lc) break;
      }
      for(int i=fr;i<=lr;i++){
        System.out.print(arr[i][lc]);
        lc--;
        if(fr>lr) break;
      }
      for(int i=lc;i>=fc;i++){
        System.out.print(arr[fr][i]);
        fr++;
        if(fr>lr) break;
      }
      for(int i=fc;i<=lc;i++){
        System.out.print(arr[fr][i]);
        fr++;
        if(fr>lr) break;
      }
    }




  }
  
}
