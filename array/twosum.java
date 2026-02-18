public class twosum {
  public static void main (String[] args){
    int[] arr={2,4,5,1,6,7,};
    int target =6;
    
    sum(arr,target);
  }
  public static void sum(int[] arr,int y){
    boolean found =false;
    for(int i=0;i<arr.length;i++){
      for (int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==y){ System.out.print("element are "+" "+arr[i] + "and" +" "+arr[j]);
         found=true;
        }
      }
    }
    if(found!=true) System.out.print("Elsement not found");
  }
}
