import java.util.Scanner;
public class AddTwoComplexNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Real Number:");
        int real1 = sc.nextInt();
        System.out.print("Enter First Imagenary Number:");
        int imagenary1 = sc.nextInt();
        System.out.print("Enter Second Real Number:");
        int real2 = sc.nextInt();
        System.out.print("Enter Second Imagenery Number:");
        int imagenary2 = sc.nextInt();
        int realsum = real1 + real2;
        int imagenarysum = imagenary1 + imagenary2;
        System.out.println("Sum = " + realsum + " + " + imagenarysum + "i");
    }
}
