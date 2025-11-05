import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr, 3);
        System.out.println(Arrays.toString(arr)); 
    }
    
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        /*k = k % n;*/
        System.out.println(k);
        
        reverse(arr, 0,n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
