import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String noSpaces = str.replace(" ", "");

        System.out.println("Without spaces: " + noSpaces);
    }
}
