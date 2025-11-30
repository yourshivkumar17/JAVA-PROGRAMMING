import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<list.size()-1;i+=2){
            Collections.swap(list,i,i+1);
        }
        System.out.println(list);
    }
}
