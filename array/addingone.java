import java.util.ArrayList;

public class addingone {
  public static void main(String[] args) {
    int[]arr={1,9,9,9};
     ArrayList<Integer> ans =addone(arr);
     
    System.out.print(ans);

  }
  public static ArrayList<Integer>  addone(int [] arr){
    ArrayList<Integer> ans = new ArrayList<>();
    int carry=1;
    int n=arr.length;
    for(int i=n-1;i>=0;i--){
      if(arr[i]+carry==10) arr[i]=0;
      else{ arr[i]+= carry;
        carry=0;
      }
      
    }
    if(carry==1){
      ans.add(1);
    }
    for(int num: arr){
      ans.add(num);
    }

   return ans ;
  }
}
  