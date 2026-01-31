import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] letters = new char[n];

        for (int i = 0; i < n; i++) {
            letters[i] = sc.next().charAt(0);
        }

        char target = sc.next().charAt(0);

        char ans = letters[0];

        for (int i = 0; i < n; i++) {
            if (letters[i] > target) {
                ans = letters[i];
                break;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
