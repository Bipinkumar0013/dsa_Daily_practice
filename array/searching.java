public class searching {
  
  public static void main(String[] args) {
    int arr[]= {10,20,30,40};
    int x=30;
    int i;
    for( i=0;i<arr.length;i++){//when we initialise i in loop then it,s scope is in between the loop
      if(arr[i]==x)  break ;
    }
    System.out.print("The place of element is "+ i);
  }
}

