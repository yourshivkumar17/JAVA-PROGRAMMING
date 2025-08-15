import java.util.Scanner;
public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number; ");
        int n = sc.nextInt();
        for(int i = n; i >=0; i-- ) {
            System.out.print(i + " ");

        }
    }
}
