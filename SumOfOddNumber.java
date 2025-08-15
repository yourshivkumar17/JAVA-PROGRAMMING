import java.util.Scanner;
public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System .out.print("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1; i <= n; i +=2) {
            sum +=i;
        }
        System.out.print(sum);

    }
}
