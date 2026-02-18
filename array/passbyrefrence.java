public class passbyrefrence {//pass by refrence
  public static void change(int[] y){
    y[2]=10;
  }
  public static void main(String[] args) {
    int [] arr={10,20,30,40};
    System.out.println(arr[2]);
    change(arr);
     System.out.println(arr[2]);
  }
  // void change(int[] y){
  //   y[2]=10;
  // }
}
