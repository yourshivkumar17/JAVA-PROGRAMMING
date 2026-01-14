import java.util.Scanner;
public class SumOfSquaresNumber633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        long a = 0;
          long b = (long)Math.sqrt(c);
          boolean found = false;
          while(a<=b) {
             long sum = a*a + b*b;
             if(sum == c) {
                found = true;
                break;
             }
                else if(sum<c) {
                    a++;
                }
                else {
                    b--;  
                }
            }
            if(found)
                System.out.println("true");
            else
                System.out.println("false");
                
            sc.close();        

    }
}
