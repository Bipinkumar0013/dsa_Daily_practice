public class secondmax {
  public static void main(String[] args) {
      int[] arr={2,4,5,1,6,7,};
      smmax(arr);
  }
  public static void smmax(int[] y){
    int max = y[0];
    for(int i =0;i<y.length;i++){
      if(y[i]>max) max=y[i];
    }
    int smax=y[0];
     for(int i =0;i<y.length;i++){
      if(y[i]>smax && y[i]!=max) smax=y[i];
    }
    System.out.print(smax);
    
  }
}
