import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        float principal = sc.nextFloat();
        System.out.println("Enter Rate");
        float rate = sc.nextFloat();
        System.out.println("Enter Time");
        float time = sc.nextFloat();
        float simple_interest = (principal*rate*time/100);
        System.out.println(simple_interest);
    }
}