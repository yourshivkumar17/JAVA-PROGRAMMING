import java.util.Scanner;
public class FindGCDOrHCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");
        int b = sc.nextInt();
        int HCF = (a < b) ? a : b;
        while(true) {
            if(a % HCF ==0 && b % HCF ==0) {
                System.out.print("HCF is "+ HCF);
                break;
            }
            HCF--;
        }
    }
}
