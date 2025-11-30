import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n1 = sc.nextInt();
        for(int i=0;i<n1;i++){
            list1.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        for(int i=0;i<n2;i++){
            list2.add(sc.nextInt());
        }
        ArrayList<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        System.out.println(merged);
    }
}
