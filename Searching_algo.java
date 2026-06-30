// import java.util.Arrays;
public class Searching_algo {
    public static void main(String[] agrs){

        // linear search
        int arr[] = {2,4,7,32,40,43,90};
        // linear search
        // int t = 32, ans = -1;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == t) {
        //        ans = i;
        //         break;
        //     }
        // }
        // System.out.println(ans);
        
        // optimized method for linear search - binary search
        int t = 7, ans = -1, n = arr.length;
        int s = 0,  e = n-1;
        while (s<=e) {
            int mid = (s+e)/2;
            if(arr[mid]== t){
                ans= mid;
                break;
            }
            
            else if(arr[mid]<t){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
}
