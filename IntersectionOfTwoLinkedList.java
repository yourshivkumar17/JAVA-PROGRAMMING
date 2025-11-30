import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> listA = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            listA.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList<Integer> listB = new LinkedList<>();
        for(int i=0;i<m;i++){
            listB.add(sc.nextInt());
        }
        LinkedList<Integer> intersection = new LinkedList<>(listA);
        intersection.retainAll(listB);
        System.out.println("Intersection:"+ intersection);
    }
}
