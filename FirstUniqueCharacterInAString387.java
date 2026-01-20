import java.util.Scanner;

public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                result = i;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
