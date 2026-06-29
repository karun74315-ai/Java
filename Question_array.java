import java.util.Arrays;

public class Question_array {
    public static void main(String[] args){
        
        int arr[] = {1,2,3,7,6,4,5};
        // max elem in array 
        // int max = arr[0];
        // int maxIndex = 0;
        // for(int i = 1; i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //         maxIndex = i;
        //     }
        // }
        // System.out.println("max element :" + max + "max index :" + maxIndex);
        
        // second max in array
        // int max = Integer.MIN_VALUE;
        // int secMax = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max){
        //         secMax = max;
        //         max = arr[i];
        //     }
        //     else if(arr[i] > secMax){
        //         secMax=arr[i];
        //     }  
        // }
        // System.out.println("max : " + max + " sec max :" + secMax);
    
        // if array is sorted
        // boolean issorted = true;
        // for (int i = 0; i < arr.length-1; i++) {
        //     if(arr[i] > arr[i+1]){
        //        issorted = false;
        //     }
        // }
        // System.out.println(issorted);
        
        // Reverse the array
        // int art[] = {1,2,3,4,5};
        // for (int i = art.length-1; i >= 0; i--) {
        //     System.out.println(art[i]);
        // }

        // left rotate to one
        // int abc[] = {1,2,3,4,5};
        // int temp = abc[0];
        // for (int i = 1; i < abc.length; i++) {
        //     abc[i-1] = abc[i];
        // }
        //   abc[abc.length-1] = temp;
        //   System.out.println(Arrays.toString(abc));
        
        // left rotate by k times
        int abv[] = {1,2,3,4,5};
        int n = abv.length, k=3;
        for(int j =1; j<=k; j++){
           int temp = abv[0];
           for (int i = 1; i < n; i++) {
             abv[i-1] = abv[i];
         }
          abv[n-1] = temp;
        }
        System.out.println(Arrays.toString(abv));
    }
}
