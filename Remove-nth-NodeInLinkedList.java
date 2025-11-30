import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int size = sc.nextInt();
        for(int i=0;i<size;i++) {
            list.add(sc.nextInt());
        }
        int n = sc.nextInt();
        list.remove(list.size()-n);
        System.out.println(list);
    }
}
