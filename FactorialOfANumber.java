import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.print(fact);
    }
}
