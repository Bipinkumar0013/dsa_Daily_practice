package sorting;

public class twoarrayintersectin {

  public static void main(String[] args) {
    int [] arr1={2,3,4,5,6};
    int [] arr2={4,5,6,8,9,10};
    int n1=arr1.length;
    int n2=arr2.length;
    int i=0,j=0;
    while(i<n1 &&j<n2){
      if(arr1[i]==arr2[j]){
        System.out.print(arr1[i] +" ");
        i++;
        j++;
      }
      else if(arr1[i]<arr2[j]) i++;
      else j++;

    }

  }
  
}
