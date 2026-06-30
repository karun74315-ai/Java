import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of  the array :");
        int size = sc.nextInt();

    int arr[] = new int[size];
    System.out.println("enter " + size + "elements:" );
    // arr[0]=10;
    // arr[1]=100;
    //  arr[2]=110;
    //   arr[3]=130;
    //    arr[4]=170;
      for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        System.out.println(arr[i]);
      }
      sc.close();
    }
    
}
