import java.util.Arrays;

public class Pass_by_refrence{
    public static void main(String[] args){
           int arr[] = {1,2,3,4};
           System.out.println("before changing...");
           System.out.println(Arrays.toString(arr));
           change(arr);
           System.out.println("after changing...");
           System.out.println(Arrays.toString(arr));

    }

    private static void change(int[] arr) {
        // arr = new int[3]; change the value
        arr[2] = 100; /*uppdate the vlaue */
    }
}