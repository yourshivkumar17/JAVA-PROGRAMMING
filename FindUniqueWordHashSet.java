import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.toLowerCase().split("\\W+");
        HashSet<String> uniquewords = new HashSet<>(Arrays.asList(words));
        for(String word : uniquewords){
            System.out.println(word);
        }
    }
}
