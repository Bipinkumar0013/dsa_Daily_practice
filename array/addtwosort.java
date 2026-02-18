public class addtwosort {
  public static void main(final String[] args) {
     int [] a={1,3,5,7,9};
     int [] b={2,4,6,8,};
     int c[] = new int [a.length+b.length];
    add(a,b,c);
    for( int ele : c){
      System.out.print(ele+" ");
    }
  }
  public static void add( int[] arr, int[] brr,int []c){
    int i=0,j=0,k=0;
     int n= c.length;
    while(k<n){
    if(i==arr.length){
      c[k++]=brr[j++];
    }
     if(j==brr.length){
      c[k++]=arr[i++];
    }
    else if (arr[i]<brr[j]){
      c[k++]=arr[i++];
    }
    else c[k++]=brr[j++];
  }

  }
  
}
