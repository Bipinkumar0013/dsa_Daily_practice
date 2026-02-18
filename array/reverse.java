public class reverse {
  public static void main(String[] args){
     int[] arr={2,4,5,1,6,7,};
  
    
    revers(arr);
    print(arr);
  }
  public static void revers(int[] y){
    int n=y.length;
    int i=0 ,j=n-1;
    while(i<j){
      int temp=y[i];
      y[i] =y[j];
      y[j]=temp;
      i++;
      j--;
    }

  }
  public static void print(int[] y){
    
    for( int ele : y){//we can,t make any change in array by the help offor each loop
      //it,s print only data structure element; 

      System.out.print(ele+" ");
    }
  }
  
}
