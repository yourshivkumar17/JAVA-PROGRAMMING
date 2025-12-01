import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();
        for(int var: list){
            if(var<x) left.add(var);
            else right.add(var);
        }
        left.addAll(right);
        System.out.println(left);
    }
    
}
