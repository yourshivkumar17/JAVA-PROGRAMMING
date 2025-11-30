import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
    }
    LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
    LinkedList<Integer> result = new LinkedList<>(set);
    System.out.println("Duplicate LinkedList"+result);
    }
}
