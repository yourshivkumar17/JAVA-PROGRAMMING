import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] emails = line.split("\\s+");
        HashSet<String> domains = new HashSet<>();
        for(String email : emails){
            if(email.contains("@")){
                domains.add(email.substring(email.indexOf
            ('@')+1).toLowerCase());
            }
        }
        for(String d : domains){
            System.out.println(d);
        }
    }
}
