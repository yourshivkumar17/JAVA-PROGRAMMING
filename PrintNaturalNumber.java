import java.util.Scanner;
public class PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}
