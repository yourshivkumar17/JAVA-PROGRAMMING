import java.util.*;
public class RemoveDuplicateFromSortedArray26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k =1;
        for(int i=1; i<n; i++) {
            if(arr[i] != arr[i-1]) {
            arr[k] = arr[i];
            k++;
            }
        }
        for(int i=0; i<k; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
