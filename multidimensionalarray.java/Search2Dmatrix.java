public class Search2Dmatrix {
  public static void main(String[] args) {
    int arr[][] ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    int target=3;
    boolean flag = false;
    int n=arr.length;
    int i=0,j=n-1;
    while(i<n && j>=0){
      if(arr[i][j]>target)
        { j--;}

      else if (arr[i][j]<target)
        { i++;}
      else{ flag =true;
      break;}
    }
    if(flag==true){System.out.print("Element exist");}
    else{ System.out.print("Element not exist");}
  }

  
}
