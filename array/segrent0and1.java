public class segrent0and1 {//by 2 pinter method
  public static void main(String[] args) {//0 on left and 1 on right
    int [] arr={1,0,0,1,0,1,1,0,1,0,1};
    int n=arr.length;
    segrent(arr,0,n-1);
    for (int ele : arr){
      System.out.print(ele+" ");
    }

  }
  public static void  segrent(int [] y, int i, int j){
     while(i<j){
      if(y[i]==0 ) i++;
      else if ( y[j]==1) j--;
      else{
      int temp=y[i];
      y[i] =y[j];
      y[j]=temp;
      
       i++;
      j--;
      }

    }
  }
}
