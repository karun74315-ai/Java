import java.util.Arrays;
public class Sorting_algos {
    
    public static void main(String[] args){
        int arr[] = { 5,4,3,2,1};
        
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]>key) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            arr[prev+1] = key;
        }
    }


    // selection-sort
    // public static void selectionSort(int[] arr) {
    //     int n = arr.length;
    //     for (int i = 0; i < n-1; i++) {
    //         int min = i;
    //         for (int j = 0; j < n-1; j++) {
    //             if (arr[j]<arr[min]) {
    //                 min = j;
    //             }
    //         }
    //         // swap i and j 
    //         int temp = arr[i];
    //         arr[i] = arr[min];
    //         arr[min] = temp;

    //     }
    // }

    // bubblle-sort
//     public static void bubbleSort(int arr[]){
//         int n = arr.length;
//         for (int i = 0; i < n-1; i++) {
//         for (int j =  0; j < n-1; j++) {
//             if(arr[j] > arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1]= temp; 
//             }
//         }
//     }
// }
    
}
