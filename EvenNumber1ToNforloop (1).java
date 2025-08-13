import java.util.Scanner;
public class EvenNumber1ToNforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        for(int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
        }
    }
}
