public class missingelement {
  //total element 1 to n-1(from 1 to n) find missing element
  public static void main(String[] args) {
    
    int [] arr={1,2,3,4,6,7};
    int n= arr.length +1;
    int sum=n*(n+1)/2;
     int asum= arrsum(arr);
     int miss=sum - asum;
     System.out.print("The missing element is"+" "+ miss);

  }
  public static int arrsum(int [] arr){
    int asum=0;
    for( int ele : arr){
      asum+=ele;
    }
    return asum;

  }
  
}
