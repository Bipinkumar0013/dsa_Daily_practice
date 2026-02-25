package sorting;

public class twoarrayunion {
   public static void main(String[] args) {
    int [] arr1={2,3,4,5,6};
    int [] arr2={4,5,6,8,9,10};
    int n1=arr1.length;
    int n2=arr2.length;
    int i=0,j=0;
    while(i<n1 && j<n2){
      if(arr1[i]==arr2[j]){
       { System.out.print(arr1[i] +" ");}
        i++;
        j++;
      }
      else if(arr1[i]<arr2[j])
        {
        System.out.print(arr1[i] +" "); 
      i++;}
      else {System.out.print(arr1[i] +" ");j++;}

    }
    if(i==n1-1){
      for(int j=n1;j<n2;j++){
        System.out.print(arr2[j]+" ");
      }
    }
    else {for(int j=n2;j<n1;j++){
        System.out.print(arr1[j]+" ");
      }

    }

  }
  
}
