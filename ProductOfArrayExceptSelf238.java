import java.util.*;
public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int product =1;
        //left side
        for(int i=0;i<n;i++){   //[1,2,3,4]
            ans[i] = product;       // // for  i=1 , ans[1] = 1                                       
            product *= arr[i];      // product = 1 × 2 = 2
         }
          //Right side
       product =1;
       for(int i=n-1;i>=0;i--){  //[1,1,2,6]
        ans[i] *= product;
        product *= arr[i];
       }
       for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
       }
        sc.close();
    }
}
