import java.util.Scanner;
public class FindMaximumInRotateSortedArray153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
        int min = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
    
}
