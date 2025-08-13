import java.util.Scanner;
public class EvenNumber1ToNdowhileloop{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n: ");
    int n = sc.nextInt();
    int i = 1;
    System.out.println("Even numbers from 1 to " + n + " are:");
    do {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
        i++;
    } while (i <= n);
    }
}

